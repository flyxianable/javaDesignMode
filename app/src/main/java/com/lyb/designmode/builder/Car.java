package com.lyb.designmode.builder;

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

    /**
     * 构造者是内部类时，实体的构造方法
     * @param carBuilder
     */
    public Car(CarInnerBuilder carBuilder){
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

    static class CarInnerBuilder implements Builder{

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

        public CarInnerBuilder buildType(String type){
            this.type = type;
            return this;
        }

        public CarInnerBuilder buildPower(String power){
            this.power = power;
            return this;
        }

        public CarInnerBuilder buildComfort(String comfort){
            this.comfort = comfort;
            return this;
        }

        @Override
        public Car build(){

            return new Car(this);
        }

    }

}
