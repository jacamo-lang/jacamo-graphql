package jacamoql.graphql.workspace;

import graphql.schema.GraphQLInputType;
import com.coxautodev.graphql.tools.*;

public class WorkspaceInput implements GraphQLInputType {
	private String workspaceName;

	public String getWsName() {
		return workspaceName;
	}

	public void setWsName(String workspaceName) {
		this.workspaceName = workspaceName;
	}

	@Override
	public String getName() {
		return "WorkspaceInput";
	}
}
