package jacamoql.graphql.agent;

import java.util.List;

public class LiteralType {

    private String functor;
    private Boolean negation;
    private List<String> arguments;
    private List<String> annotations;

    public String getFunctor() {
        return functor;
    }

    public void setFunctor(String functor) {
        this.functor = functor;
    }

    public Boolean getNegation() {
        return negation;
    }

    public void setNegation(Boolean negation) {
        this.negation = negation;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public List<String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<String> annotations) {
        this.annotations = annotations;
    }
}
