package jacamoql.graphql.agent;

import java.util.ArrayList;
import java.util.List;

public class AgentType {

    private String name;
    private List<LiteralType> beliefs;
    private List<String> focus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LiteralType> getBeliefs() {
        if( beliefs == null ) { beliefs = new ArrayList<LiteralType>(); }
        return beliefs;
    }

    public void setBeliefs(List<LiteralType> beliefs) {
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
