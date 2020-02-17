package jacamoql.graphql.utils;

import org.springframework.http.HttpStatus;

import graphql.schema.GraphQLOutputType;

public class Payload implements GraphQLOutputType {

	private Boolean ok;
	private HttpStatus httpStatus;
	private String message;

    @Override
    public String getName() {
        return "Payload";
    }

	public Boolean getOk() {
		return ok;
	}

	public void setOk(Boolean ok) {
		this.ok = ok;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}