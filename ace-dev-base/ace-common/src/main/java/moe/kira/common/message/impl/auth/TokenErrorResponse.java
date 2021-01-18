package moe.kira.common.message.impl.auth;

import com.github.wxiaoqi.security.common.constant.RestCodeConstants;

import moe.kira.common.message.impl.base.BasicResponse;

/**
 * Created by ace on 2017/8/23.
 */
public class TokenErrorResponse extends BasicResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
