package com.feizi.wx.controller;

import com.feizi.wx.entity.Area;
import com.feizi.wx.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by feizi on 2018/3/17.
 */
@RestController
@RequestMapping(value = "/superadmin")
public class AreaController {

    @Resource
    private AreaService areaService;

    @RequestMapping(value = "/areaList", method = RequestMethod.GET)
    private Map<String, Object> areaList(){
        Map<String, Object> modelMap = new HashMap();
        List<Area> areaList = areaService.queryAreaList();
        modelMap.put("areaList", areaList);
        return modelMap;
    }

}
