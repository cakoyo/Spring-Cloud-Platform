package moe.kira.common.message;

import org.springframework.lang.NonNull;

import moe.kira.common.message.data.TableData;

public interface ResultResponse<T> extends RestResponse<TableData<T>> {
    @NonNull
    public TableData<T> getData();
    
    public void setData(@NonNull TableData<T> data);
}