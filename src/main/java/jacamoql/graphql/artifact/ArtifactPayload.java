package jacamoql.graphql.artifact;

import jacamoql.graphql.utils.Payload;
import jacamoql.graphql.artifact.ArtifactType;

public class ArtifactPayload extends Payload {
	
	private ArtifactType artifact;
	
    @Override
    public String getName() {
        return "ArtifactPayload";
    }

	public ArtifactType getArtifact() {
		return artifact;
	}

	public void setArtifact(ArtifactType artifact) {
		this.artifact = artifact;
	}
}