package com.kimbsy.dispatch;

import com.kimbsy.dispatch.executor.Executor;
import com.kimbsy.dispatch.executor.ExecutorFactory;
import com.kimbsy.dispatch.request.Request;
import com.kimbsy.dispatch.request.RequestParser;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for the parsing of {@link Message} objects into {@link Request} objects, creating an {@link
 * Executor} instance and then executing the request.
 *
 * @author kimbsy
 */
@Component
public class DispatchController {

    /**
     * Handle the execution of a request message.
     *
     * @param message The SQS message object.
     */
    public void handle(Message message) {

        Request request = RequestParser.INSTANCE.getRequest(message);

        Executor executor = ExecutorFactory.INSTANCE.getExecutor(request);
        executor.setRequest(request);
        executor.execute();
    }
}
