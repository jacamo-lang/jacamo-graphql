package jacamoql.graphql.workspace;

import java.util.List;

import jacamoql.graphql.artifact.ArtifactType;

public class WorkspaceType {
    private String id;
    private String name;
    private List<ArtifactType> artifacts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ArtifactType> getArtifacts() {
		return artifacts;
	}

	public void setArtifacts(List<ArtifactType> artifacts) {
		this.artifacts = artifacts;
	}
}