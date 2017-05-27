package com.kimbsy.dispatch.request;

import com.google.gson.Gson;
import org.springframework.messaging.Message;
import com.google.common.base.Preconditions;

import java.lang.reflect.Type;

/**
 * @author kimbsy
 */
public class RequestParser {

    public static RequestParser INSTANCE = new RequestParser();

    public Request getRequest(Message message) {
        Preconditions.checkNotNull(message, "message cannot be null");
        Preconditions.checkNotNull(message.getPayload(), "message payload cannot be null");

        Request request = new Gson().fromJson((String) message.getPayload(), (Type) Request.class);
        return request;
    }
}
