package com.lyb.designmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lyb.designmode.decorate.DecorateDemo;
import com.lyb.designmode.facade.FacadeDemo;
import com.lyb.designmode.proxy.dynamic.DynamicProxyDemo;
import com.lyb.designmode.proxy.static_proxy.StaticProxyDemo;
import com.lyb.designmode.single_instance.SingleLazyInstance;

public class MainActivity extends AppCompatActivity {

    LazyThread[] threads = new LazyThread[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        for(int i=0; i< threads.length; i++){
//            threads[i] = new LazyThread();
//
//        }
//        for(int i=0; i< threads.length; i++){
//            threads[i].start();
//        }
//
//        //调用简单工厂
//        Shape shape = SimpleShapeFactory.buildShape("circle");
//        shape.draw();
//        if(shape instanceof CircleShap){
//            System.out.println(shape.getClass());
//        }
//
//        //调用工厂方法模式
//        Shape shape1 = new RectFactory().buidShape();
//        shape1.draw();

        //抽象工厂模式
//        AbstractFactory flatColorfulShape = new FlatColorfulShape();
//        AbstractFactory thredDimenColorfulShape = new ThredDimenColorfulShape();
//        flatColorfulShape.buildColor("blue");
//        flatColorfulShape.buildShape("rect");
//        thredDimenColorfulShape.buildColor("red");
//        thredDimenColorfulShape.buildShape("cylinder");

//        new DecorateDemo().create();

//        new FacadeDemo().make();

//        new StaticProxyDemo().treat();

        new DynamicProxyDemo().treat();
    }

    class LazyThread extends Thread{
        @Override
        public void run() {
            SingleLazyInstance singleLazyInstance = SingleLazyInstance.getInstance();
            Log.v("lazy_2022", "instance =" + singleLazyInstance.hashCode());
        }
    }


}

