package com.example.demo.model;

import java.util.Date;

/**
 * Created by pcm on 2017/7/21.
 */
public class NewOrder
{
    private Integer orderid;

    private Integer userid;

    private String createtime;

    private String description;

    public Integer getOrderid()
    {
        return orderid;
    }

    public void setOrderid(Integer orderid)
    {
        this.orderid = orderid;
    }

    public Integer getUserid()
    {
        return userid;
    }

    public void setUserid(Integer userid)
    {
        this.userid = userid;
    }

    public String getCreatetime()
    {
        return createtime;
    }

    public void setCreatetime(String createtime)
    {
        this.createtime = createtime;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
