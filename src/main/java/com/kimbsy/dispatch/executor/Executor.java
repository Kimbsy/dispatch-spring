package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.lib.request.Request;

/**
 * Describes a class capable of executing an action.
 * <p>
 * <code>T</code> is the type of the return value.
 *
 * @author kimbsy
 */
public interface Executor<T> {

    /**
     * Specify the request to execute.
     *
     * @param request The {@link Request} object.
     */
    void setRequest(Request request);

    /**
     * Execute the request.
     *
     * @return The return value of the execution.
     */
    T execute();
}
