package moe.kira.common.message.impl.base;

import java.util.Optional;

import org.springframework.lang.Nullable;

import moe.kira.common.message.Response;

/**
 * Created by ace on 2017/8/23.
 */
public abstract class BasicResponse implements Response {
    private int statusCode = DEFAULT_STATUS_CODE;
    
    @Nullable
    private String message;

    public BasicResponse(int status, String message) {
        this.statusCode = status;
        this.message = message;
    }

    public BasicResponse() {}

    @Override
    public final Optional<String> getMessage() {
        return Optional.ofNullable(message);
    }

    @Override
    public final void setMessage(@Nullable String message) {
        this.message = message;
    }

    @Override
    public final int getStatusCode() {
        return statusCode;
    }

    @Override
    public final void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
