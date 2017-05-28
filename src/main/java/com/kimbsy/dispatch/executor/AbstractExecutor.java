package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.request.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kimbsy
 */
public abstract class AbstractExecutor<T> implements Executor<T> {

    public Logger log = getLogger();

    protected Request request;

    private Logger getLogger() {
        if (log == null) {
            log = LoggerFactory.getLogger(getClass());
        }
        return log;
    }

    @Override
    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public abstract T execute();
}
