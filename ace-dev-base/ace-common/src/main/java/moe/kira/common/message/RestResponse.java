package moe.kira.common.message;

import org.springframework.lang.NonNull;

public interface RestResponse<T> extends Response {
    @NonNull
    public T getData();
    
    public void setData(@NonNull T data);
}