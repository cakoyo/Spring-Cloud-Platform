package moe.kira.common.message.impl;

import moe.kira.common.message.Response;
import moe.kira.common.message.impl.base.BasicResponse;

/**
 * Created by ace on 2017/8/23.
 */
public class SimpleResponse extends BasicResponse {
    public SimpleResponse(int status, String message) {
        super(status, message);
    }

    public SimpleResponse() {
        super();
    }
}
