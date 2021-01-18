package moe.kira.common.message.impl.base;

import org.springframework.lang.NonNull;

import moe.kira.common.message.RestResponse;
import moe.kira.common.utils.Asserts;

/**
 * Created by ace on 2017/8/23.
 */
public abstract class BasicRestResponse<T> extends BasicResponse implements RestResponse<T> {
    @NonNull
    private T data;
    
    public BasicRestResponse(T data) {
        this.data = data;
    }
    
    @NonNull
    @Override
    public final T getData() {
        return data;
    }

    @Override
    public final void setData(@NonNull T data) {
        Asserts.requiresNonnull(data);
        this.data = data;
    }
}
