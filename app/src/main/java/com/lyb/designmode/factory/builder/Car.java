package com.lyb.designmode.factory.builder;

public class Car {

    public Car(CarBuilder carBuilder){
        if ("紧凑型车".equals(carBuilder.getType())) {
            this.size = "大小--紧凑型车";
        } else if ("中型车".equals(carBuilder.getType())) {
            this.size = "大小--中型车";
        } else {
            this.size = "大小--其他";
        }
    }


    // 尺寸
    private String size;

    // 方向盘
    private String steeringWheel;

    // 底座
    private String pedestal;

    // 轮胎
    private String wheel;

    // 排量
    private String displacement;

    // 最大速度
    private String maxSpeed;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getPedestal() {
        return pedestal;
    }

    public void setPedestal(String pedestal) {
        this.pedestal = pedestal;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [size=" + size + ", steeringWheel=" + steeringWheel + ", pedestal=" + pedestal + ", wheel=" + wheel
                + ", displacement=" + displacement + ", maxSpeed=" + maxSpeed + "]";
    }

}
