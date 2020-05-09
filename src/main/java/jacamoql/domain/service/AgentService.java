package jacamoql.domain.service;

import jacamo.infra.JaCaMoLauncher;
import jason.asSemantics.Agent;
import jason.asSyntax.Literal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AgentService {
    public Agent getAgentByName(String name) {
        return JaCaMoLauncher.getRunner().getAg(name).getTS().getAg();
    }

    public List<Agent> getAllAgents() {
        List<Agent> agentArray = new ArrayList<Agent>();
        for(String arch: JaCaMoLauncher.getRunner().getAgs().keySet()){
            agentArray.add(JaCaMoLauncher.getRunner().getAgs().get(arch).getTS().getAg());
        }
        return agentArray;
    }

    public List<Literal> getAllBeliefs(String name) {
      Agent ag = getAgentByName(name);
      List<Literal> literals = new ArrayList<>();
      for (Literal l : ag.getBB()) {
        literals.add(l);
      }
      return literals;
    }

    public List<String> getAgentFocus(String agentName) {
        return null;
    }
}