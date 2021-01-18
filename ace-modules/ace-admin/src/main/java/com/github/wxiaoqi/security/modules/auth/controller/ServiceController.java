package com.github.wxiaoqi.security.modules.auth.controller;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.modules.auth.biz.ClientBiz;
import com.github.wxiaoqi.security.modules.auth.entity.Client;

import moe.kira.common.message.Responses;
import moe.kira.common.message.impl.ObjectRestResponse;
import moe.kira.common.message.impl.SimpleResponse;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ace
 * @create 2017/12/26.
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz,Client>{

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public SimpleResponse modifyUsers(@PathVariable int id, String clients){
        baseBiz.modifyClientServices(id, clients);
        return Responses.normalize();
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<List<Client>> getUsers(@PathVariable int id){
        return new ObjectRestResponse<List<Client>>(baseBiz.getClientServices(id));
    }
}
