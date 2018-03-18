package com.feizi.wx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by feizi on 2018/3/15.
 */
public class Area implements Serializable {
    private static final long serialVersionUID = -2531155123415313959L;

    //区域ID
    private Integer areaId;
    //区域名称
    private String areaName;
    //区域优先级
    private Integer priority;
    //创建时间
    private Date createTime;
    //最后修改时间
    private Date lastEditTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
