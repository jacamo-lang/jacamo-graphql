package jacamoql.graphql.agent;

import java.util.ArrayList;
import java.util.List;

public class AgentType {

    private String name;
    private List<String> beliefs;
    private List<String> focus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBeliefs() {
        if( beliefs == null ) { beliefs = new ArrayList<String>(); }
        return beliefs;
    }

    public void setBeliefs(List<String> beliefs) {
        this.beliefs = beliefs;
    }

    public List<String> getFocus() {
        if( focus == null ) { focus = new ArrayList<String>(); }
        return focus;
    }

    public void setFocus(List<String> focus) {
        this.focus = focus;
    }
}
