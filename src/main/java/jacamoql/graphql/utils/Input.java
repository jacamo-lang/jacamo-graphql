package jacamoql.graphql.utils;

import org.springframework.http.HttpStatus;

import graphql.schema.GraphQLInputType;

public class Input implements GraphQLInputType {

    @Override
    public String getName() {
        return this.getClass().getName();
    }
}