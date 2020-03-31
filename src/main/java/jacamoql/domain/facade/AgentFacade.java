package jacamoql.domain.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import jacamo.infra.JaCaMoLauncher;
import jacamoql.domain.service.AgentService;
import jacamoql.graphql.agent.AgentType;
import jason.asSemantics.Agent;

@Component
public class AgentFacade {

    @Autowired
    AgentService agentService;

    public AgentType getAgent(String name) {
        if(name != null) {
            Agent agent = agentService.getAgentByName(name);
            String agName = agent.getTS().getUserAgArch().getAgName();
            List<String> beliefs = agentService.getBeliefsByName(agName);
            AgentType retAgent = new AgentType();
            retAgent.setName(agName);
            retAgent.setBeliefs(beliefs);
            return retAgent;
        }
        return null;
    }

    public List<AgentType> getAllAgents() {
        List<AgentType> retArray = new ArrayList<AgentType>();

        for(String arch: JaCaMoLauncher.getRunner().getAgs().keySet()){
            AgentType agent = new AgentType();
            String agName = JaCaMoLauncher.getRunner().getAgs().get(arch).getAgName();
            agent.setName(agName);
            // agent.setName(JaCaMoLauncher.getRunner().getAgs().get(arch).getAgName());
            List<String> beliefs = agentService.getBeliefsByName(agName);
            agent.setBeliefs(beliefs);
            retArray.add(agent);
        }
        return retArray;
    }

    public AgentType createAgent() {
        return null;
    }
}
