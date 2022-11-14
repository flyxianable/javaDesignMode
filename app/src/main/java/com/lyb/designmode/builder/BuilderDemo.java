package com.lyb.designmode.builder;

public class BuilderDemo {

    public void treate() {

        Car car1 = new CarBuilder().

                buildType("很舒适").

                buildPower("动力一般").

                buildType("紧凑型车").build();

        Car car2 = new Car.CarInnerBuilder().

                buildType("很舒适").

                buildPower("动力一般").

                buildType("紧凑型车").build();
    }
}
