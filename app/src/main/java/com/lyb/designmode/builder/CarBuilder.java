package com.lyb.designmode.builder;

public class CarBuilder implements Builder{

    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }


    public String getComfort() {
        return comfort;
    }


    // 车型
    private String type;

    // 动力
    private  String power;

    // 舒适性
    private  String comfort;

    public CarBuilder buildType(String type){
        this.type = type;
        return this;
    }

    public CarBuilder buildPower(String power){
        this.power = power;
        return this;
    }

    public CarBuilder buildComfort(String comfort){
        this.comfort = comfort;
        return this;
    }

    @Override
    public Car build(){

        return new Car(this);
    }

}
