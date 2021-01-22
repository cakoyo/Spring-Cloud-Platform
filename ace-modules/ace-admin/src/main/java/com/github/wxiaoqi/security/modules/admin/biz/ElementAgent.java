package com.github.wxiaoqi.security.modules.admin.biz;

import com.github.wxiaoqi.security.common.biz.MapperAgent;
import com.github.wxiaoqi.security.modules.admin.entity.Element;
import com.github.wxiaoqi.security.modules.admin.mapper.ElementMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author the sun
 * @create 2017-06-23 20:27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ElementAgent extends MapperAgent<Element, ElementMapper> {
    public List<Element> getAuthorityElementByUserId(String userId){
       return mapper.selectAuthorityElementByUserId(userId);
    }
    public List<Element> getAuthorityElementByUserId(String userId,String menuId){
        return mapper.selectAuthorityMenuElementByUserId(userId,menuId);
    }

    public List<Element> getAllElementPermissions(){
        return mapper.selectAllElementPermissions();
    }
}
