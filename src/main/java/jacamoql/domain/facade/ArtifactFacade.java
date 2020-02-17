package jacamoql.domain.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import jacamo.infra.JaCaMoLauncher;
import jacamoql.domain.service.ArtifactService;
import jacamoql.graphql.artifact.ArtifactType;

@Component
public class ArtifactFacade {

    @Autowired
    ArtifactService artifactService;

    public List<ArtifactType> getArtifacts(String workspaceName) {
        if( workspaceName != null ) {
            return artifactService.getArtifactsByWorkspace(workspaceName);
        }

        return artifactService.getAllArtifacts();
    }

    public ArtifactType createArtifact() {
        return null;
    }
}