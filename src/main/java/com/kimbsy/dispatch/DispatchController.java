package com.kimbsy.dispatch;

import com.kimbsy.dispatch.executor.Executor;
import com.kimbsy.dispatch.executor.ExecutorFactory;
import com.kimbsy.dispatch.request.Request;
import com.kimbsy.dispatch.request.RequestParser;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author kimbsy
 */
@Component
public class DispatchController {

    public void test(Message message) {

        Request request = RequestParser.INSTANCE.getRequest(message);

        Executor executor = ExecutorFactory.INSTANCE.getExecutor(request);

        executor.setRequest(request);

        executor.execute();
    }
}
