package com.feizi.wx.service;

import com.feizi.wx.entity.Area;

import java.util.List;

/**
 * Created by feizi on 2018/3/17.
 */
public interface AreaService {
    /**
     * 查询区域列表
     * @return
     */
    List<Area> queryAreaList();

    /**
     * 根据区域ID查询区域信息
     * @param areaId 区域ID
     * @return
     */
    Area queryAreaById(Integer areaId);

    /**
     * 新增区域信息
     * @param area 区域信息Entity
     * @return
     */
    int insertArea(Area area);

    /**
     * 修改区域信息
     * @param area 区域信息Entity
     * @return
     */
    int updateArea(Area area);

    /**
     * 根据区域ID删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(Integer areaId);
}
