package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    private long seckilled;

    private long userphone;

    private short state;

    private Date createTime;
    //多对一
    private Seckill seckill;
    public long getSeckilled() {
        return seckilled;
    }

    public long getUserphone() {
        return userphone;
    }

    public short getState() {
        return state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setSeckilled(long seckilled) {
        this.seckilled = seckilled;
    }

    public void setUserphone(long userphone) {
        this.userphone = userphone;
    }

    public void setState(short state) {
        this.state = state;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckilled=" + seckilled +
                ", userphone=" + userphone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
