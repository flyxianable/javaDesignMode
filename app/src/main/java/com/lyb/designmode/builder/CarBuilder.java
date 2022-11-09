package com.lyb.designmode.builder;

public class CarBuilder {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    // 车型
    private String type;

    // 动力
    private String power;

    // 舒适性
    private String comfort;
}
