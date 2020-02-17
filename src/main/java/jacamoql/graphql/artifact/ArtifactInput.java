package jacamoql.graphql.artifact;

import graphql.schema.GraphQLInputType;

import jacamoql.graphql.utils.Input;
import jacamoql.graphql.workspace.WorkspaceType;

public class ArtifactInput extends Input {

    private String artifactName;

    public String getArtifactName() {
        return this.artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }
}