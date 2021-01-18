package com.github.wxiaoqi.security.api.vo.log;

import java.io.Serializable;
import lombok.Data;

@Data
public class LogInfo implements Serializable{
    private static final long serialVersionUID = 8621650946371618892L;

    private final String menu;
    private final String opt;
    private final String uri;
    private final long crtTime;
    private final String crtUser;
    private final String crtName;
    private final String crtHost;
    private final String body;
}
