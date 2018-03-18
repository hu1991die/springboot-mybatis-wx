package com.feizi.wx.service.impl;

import com.feizi.wx.dao.AreaDao;
import com.feizi.wx.entity.Area;
import com.feizi.wx.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by feizi on 2018/3/17.
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaDao areaDao;

    /**
     * 查询区域列表
     * @return
     */
    @Override
    public List<Area> queryAreaList() {
        return areaDao.queryAreaList();
    }

    /**
     * 根据区域ID查询区域信息
     * @param areaId 区域ID
     * @return
     */
    @Override
    public Area queryAreaById(Integer areaId) {
        return areaDao.queryAreaById(areaId);
    }

    /**
     * 新增区域信息
     * @param area 区域信息Entity
     * @return
     */
    @Transactional
    @Override
    public int insertArea(Area area) {
        return areaDao.insertArea(area);
    }

    /**
     * 修改区域信息
     * @param area 区域信息Entity
     * @return
     */
    @Transactional
    @Override
    public int updateArea(Area area) {
        return areaDao.updateArea(area);
    }

    /**
     * 根据区域ID删除区域信息
     * @param areaId
     * @return
     */
    @Transactional
    @Override
    public int deleteArea(Integer areaId) {
        return areaDao.deleteArea(areaId);
    }
}
