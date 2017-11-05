package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.lib.request.Request;
import com.kimbsy.dispatch.lib.request.RequestType;

/**
 * This class is responsible for instantiating {@link Executor} objects appropriate to a given {@link Request}.
 *
 * @author kimbsy
 */
public class ExecutorFactory {

    public static ExecutorFactory INSTANCE = new ExecutorFactory();

    /**
     * Get an {@link Executor} for the specified {@link Request}.
     *
     * @param request The request object.
     * @return The executor instance.
     */
    public Executor getExecutor(Request request) {

        RequestType requestType = request.getRequestType();

        switch (requestType) {
            case SYSTEM_OUT_PRINT:
                return new SystemOutPrintExecutor();
            case WATCH_NEXT:
                return new WatchNextExecutor();
            default:
                return null;
        }
    }
}
