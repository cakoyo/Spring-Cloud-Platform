package com.github.wxiaoqi.security.common.rest;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.github.wxiaoqi.security.common.context.BaseContextHandler;
import com.github.wxiaoqi.security.common.util.Query;
import lombok.extern.slf4j.Slf4j;
import moe.kira.common.message.Responses;
import moe.kira.common.message.impl.ObjectRestResponse;
import moe.kira.common.message.impl.SimpleResponse;
import moe.kira.common.message.impl.TableResultResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author the sun
 * @create 2017-06-15 8:48
 */
@Slf4j
public class BaseController<Biz extends BaseBiz,Entity> {
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected Biz baseBiz;

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public SimpleResponse add(@RequestBody Entity entity){
        baseBiz.insertSelective(entity);
        return Responses.normalize();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<Entity> get(@PathVariable int id){
        Entity o = (Entity) baseBiz.selectById(id);
        return new ObjectRestResponse<>(o);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public SimpleResponse update(@RequestBody Entity entity){
        baseBiz.updateSelectiveById(entity);
        return Responses.normalize();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public SimpleResponse remove(@PathVariable int id){
        baseBiz.deleteById(id);
        return Responses.normalize();
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<List<Entity>> all(){
        return new ObjectRestResponse<>(baseBiz.selectListAll());
    }
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Entity> list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        return baseBiz.selectByQuery(query);
    }
    public String getCurrentUserName(){
        return BaseContextHandler.getUsername();
    }
}
