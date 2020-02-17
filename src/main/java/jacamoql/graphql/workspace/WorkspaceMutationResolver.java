package jacamoql.graphql.workspace;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.stereotype.Component;

@Component
public class WorkspaceMutationResolver implements GraphQLMutationResolver {

    
    public String createWorkspace(WorkspaceInput input) {
        return "ok";
    }
}