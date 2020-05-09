package jacamoql.domain.facade;

import jacamo.infra.JaCaMoLauncher;

import jacamoql.domain.service.AgentService;
import jacamoql.graphql.agent.AgentType;
import jacamoql.graphql.agent.LiteralType;

import jason.asSemantics.Agent;
import jason.asSyntax.Literal;
import jason.asSyntax.Term;
import jason.NoValueException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgentFacade {

    @Autowired
    AgentService agentService;

    public AgentType getAgent(String name) throws NoValueException {
        if(name != null) {
            Agent agent = agentService.getAgentByName(name);
            String agName = agent.getTS().getUserAgArch().getAgName(); // Should it access the Jason API?
            List<Literal> bb = agentService.getAllBeliefs(agName);
            List<LiteralType> beliefs = new ArrayList<>();
            beliefs = literal2LiteralType(bb);
            AgentType retAgent = new AgentType();
            retAgent.setName(agName);
            retAgent.setBeliefs(beliefs);
            return retAgent;
        }
        return null;
    }

    private List<LiteralType> literal2LiteralType(List<Literal> bb) throws NoValueException {
      List<LiteralType> beliefs = new ArrayList<>();
      for(Literal l : bb){
        LiteralType belief = new LiteralType();
        belief.setFunctor(l.getFunctor());
        belief.setNegation(l.negated());
        if(l.hasTerm()){
          List<String> arguments = new ArrayList<String>();
          for (Term t : l.getTerms()){
            String term = t.toString();
            arguments.add(term);
          }
          belief.setArguments(arguments);
        }
        if(l.hasAnnot()){
          List<String> annotations = new ArrayList<String>();
          for (Term t : l.getAnnots()){
            String term = t.toString();
            annotations.add(term);
          }
          belief.setAnnotations(annotations);
        }
        beliefs.add(belief);
      }
      return beliefs;
    }

    public List<AgentType> getAllAgents() {
        List<AgentType> retArray = new ArrayList<AgentType>();

        for(String arch: JaCaMoLauncher.getRunner().getAgs().keySet()){
            AgentType agent = new AgentType();
            String agName = JaCaMoLauncher.getRunner().getAgs().get(arch).getAgName();
            agent.setName(agName);
            retArray.add(agent);
        }
        return retArray;
    }

    public AgentType createAgent() {
        return null;
    }
}