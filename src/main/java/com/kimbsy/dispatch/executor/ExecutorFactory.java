package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.request.Request;
import com.kimbsy.dispatch.request.RequestType;
import org.springframework.messaging.Message;

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
            default:
                return null;
        }
    }
}
