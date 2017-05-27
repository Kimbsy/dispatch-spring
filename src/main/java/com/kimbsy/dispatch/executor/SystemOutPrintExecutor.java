package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.request.Request;

/**
 * @author kimbsy
 */
public class SystemOutPrintExecutor implements Executor<Boolean> {

    Request request;

    @Override
    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public Boolean execute() {
        for (String argument : request.getArguments()) {
            System.out.println(argument);
        }
        return true;
    }
}
