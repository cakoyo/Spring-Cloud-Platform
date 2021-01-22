package com.github.wxiaoqi.security.modules.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.modules.admin.biz.MenuAgent;
import com.github.wxiaoqi.security.modules.admin.biz.UserAgent;
import com.github.wxiaoqi.security.modules.admin.entity.Menu;
import com.github.wxiaoqi.security.modules.admin.entity.User;
import com.github.wxiaoqi.security.modules.admin.rpc.service.PermissionService;
import com.github.wxiaoqi.security.modules.admin.vo.FrontUser;
import com.github.wxiaoqi.security.modules.admin.vo.FrontUserV2;
import com.github.wxiaoqi.security.modules.admin.vo.MenuTree;

import moe.kira.common.message.impl.ObjectRestResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author the sun
 * @create 2017-06-08 11:51
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserAgent,User> {
    @Autowired
    private PermissionService permissionService;

    @Autowired
    private MenuAgent menuBiz;

    @RequestMapping(value = "/front/info", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getUserInfo(String token) throws Exception {
        FrontUser userInfo = permissionService.getUserInfo(token);
        if(userInfo==null) {
            return ResponseEntity.status(401).body(false);
        } else {
            return ResponseEntity.ok(userInfo);
        }
    }

    @RequestMapping(value = "/v2/front/info", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse getUserInfoV2() throws Exception {
        FrontUserV2 userInfo = permissionService.getUserInfoV2();
        return new ObjectRestResponse<FrontUserV2>(userInfo);
    }

    @RequestMapping(value = "/front/menus", method = RequestMethod.GET)
    public @ResponseBody
    List<MenuTree> getMenusByUsername(String token) throws Exception {
        return permissionService.getMenusByUsername(token);
    }

    @RequestMapping(value = "/front/menu/all", method = RequestMethod.GET)
    public @ResponseBody
    List<Menu> getAllMenus() throws Exception {
        return menuBiz.selectAll();
    }
}
