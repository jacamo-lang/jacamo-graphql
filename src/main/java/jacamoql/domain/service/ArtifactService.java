package jacamoql.domain.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import jacamoql.graphql.artifact.ArtifactType;

@Service
public class ArtifactService {

    public List<ArtifactType> getAllArtifacts() {
        // TODO[cleber]: implementar metodo para buscar no JaCaMo
        List<ArtifactType> artifactArray = new ArrayList<ArtifactType>();
        return artifactArray;
    }

    public List<ArtifactType> getArtifactsByWorkspace(String workspaceName) {
        // TODO: implementar metodo para buscar no JaCaMo
        List<ArtifactType> artifactArray = new ArrayList<ArtifactType>();
        return artifactArray;
    }
}