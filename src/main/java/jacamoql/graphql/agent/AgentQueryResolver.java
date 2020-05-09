package jacamoql.graphql.agent;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jacamoql.domain.facade.AgentFacade;
import jason.NoValueException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgentQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private AgentFacade agentFacade;

    public AgentType agent(String name) throws NoValueException {
        return agentFacade.getAgent(name);
    }

    public List<AgentType> agents() {
        return agentFacade.getAllAgents();
    }
}
