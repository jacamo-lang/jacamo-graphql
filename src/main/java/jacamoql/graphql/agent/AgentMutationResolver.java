package jacamoql.graphql.agent;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import jacamoql.domain.facade.AgentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AgentMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private AgentFacade agentFacade;

    public AgentType createAgent() {
        return null;
    }
}