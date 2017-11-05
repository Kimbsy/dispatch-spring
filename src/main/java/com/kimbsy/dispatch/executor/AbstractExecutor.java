package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.lib.request.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains the functionality common to all child {@link Executor} classes.
 *
 * @author kimbsy
 */
public abstract class AbstractExecutor<T> implements Executor<T> {

    public Logger log = getLogger();

    protected Request request;

    /**
     * Get a {@link Logger} instance for this class.
     * <p>
     * Lazily loaded for performance.
     *
     * @return The logger instance.
     */
    private Logger getLogger() {
        if (log == null) {
            log = LoggerFactory.getLogger(getClass());
        }
        return log;
    }

    /**
     * Set the request.
     *
     * @param request The {@link Request} object.
     */
    @Override
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * Execute the {@link Request}.
     *
     * @return The return value of the execution.
     */
    @Override
    public abstract T execute();
}
