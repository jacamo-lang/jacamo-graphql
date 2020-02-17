package jacamoql.graphql.artifact;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jacamoql.domain.facade.ArtifactFacade;

@Component
public class ArtifactQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ArtifactFacade artifactFacade;

    public List<ArtifactType> artifacts(String workspaceName) {
        return artifactFacade.getArtifacts(workspaceName);
    }
}