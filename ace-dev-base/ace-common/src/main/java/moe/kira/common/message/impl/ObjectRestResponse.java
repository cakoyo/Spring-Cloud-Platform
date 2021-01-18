package moe.kira.common.message.impl;

import moe.kira.common.message.impl.base.BasicRestResponse;

/**
 * Created by Ace on 2017/6/11.
 */
public class ObjectRestResponse<T> extends BasicRestResponse<T> {
    public ObjectRestResponse(T data) {
        super(data);
    }
}
