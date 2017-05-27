package com.kimbsy.dispatch.request;

import java.util.List;

/**
 * @author kimbsy
 */
public class Request {

    private RequestType requestType;
    private List<String> arguments;

    public Request(RequestType requestType, List<String> arguments) {
        this.requestType = requestType;
        this.arguments = arguments;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (requestType != request.requestType) return false;
        return arguments != null ? arguments.equals(request.arguments) : request.arguments == null;
    }

    @Override
    public int hashCode() {
        int result = requestType != null ? requestType.hashCode() : 0;
        result = 31 * result + (arguments != null ? arguments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("requestType", requestType)
                .append("arguments", arguments)
                .toString();
    }
}
