package jacamoql.graphql.artifact;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jacamoql.domain.facade.ArtifactFacade;

@Component
public class ArtifactMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private ArtifactFacade artifactFacade;

    public ArtifactPayload createArtifact(ArtifactInput input) {
        return null;
    }
}