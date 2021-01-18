package com.github.wxiaoqi.security.api.vo.authority;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * ${DESCRIPTION}
 *
 * @author the sun
 * @create 2017-06-22 15:19
 */
@Data
@Builder
public class PermissionInfo implements Serializable {
    private static final long serialVersionUID = -2907076988598014850L;
    
    private final String code;
    private final String type;
    private final String uri;
    private final String method;
    private final String name;
    private final String menu;
}
