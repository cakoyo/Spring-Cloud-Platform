package moe.kira.common.message;

import moe.kira.common.message.impl.SimpleResponse;

public abstract class Responses {
    public static SimpleResponse normalize() {
        return new SimpleResponse();
    }
}