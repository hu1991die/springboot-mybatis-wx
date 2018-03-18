package com.feizi.wx.dao;

import com.feizi.wx.SpringbootMybatisWxApplication;
import com.feizi.wx.entity.Area;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by feizi on 2018/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootMybatisWxApplication.class})
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryAreaList() throws Exception {
        List<Area> areaList = areaDao.queryAreaList();
        Assert.assertEquals(2, areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() throws Exception {
    }

    @Test
    @Ignore
    public void insertArea() throws Exception {
    }

    @Test
    @Ignore
    public void updateArea() throws Exception {
    }

    @Test
    @Ignore
    public void deleteArea() throws Exception {
    }

}