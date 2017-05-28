package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.request.Request;
import com.kimbsy.dispatch.request.RequestType;

/**
 * @author kimbsy
 */
public class ExecutorFactory {

    public static ExecutorFactory INSTANCE = new ExecutorFactory();

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
