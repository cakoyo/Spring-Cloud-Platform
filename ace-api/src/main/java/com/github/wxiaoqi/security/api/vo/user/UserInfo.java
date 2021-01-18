package com.github.wxiaoqi.security.api.vo.user;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -4778207408896557079L;
    
    public String id;
    public String username;
    public String password;
    public String name;
    private String description;
}
