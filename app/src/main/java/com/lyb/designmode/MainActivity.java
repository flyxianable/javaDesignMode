package com.lyb.designmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lyb.designmode.factory.abstract_factory_pattern.AbstractFactory;
import com.lyb.designmode.factory.abstract_factory_pattern.FlatColorfulShape;
import com.lyb.designmode.factory.abstract_factory_pattern.ThredDimenColorfulShape;
import com.lyb.designmode.factory.compose.SafeComponent;
import com.lyb.designmode.factory.compose.SafeLeaf;
import com.lyb.designmode.factory.compose.SafeNode;
import com.lyb.designmode.factory.factory_method_pattern.RectFactory;
import com.lyb.designmode.factory.simple_factory_pattern.CircleShap;
import com.lyb.designmode.factory.simple_factory_pattern.Shape;
import com.lyb.designmode.factory.simple_factory_pattern.SimpleShapeFactory;
import com.lyb.designmode.instance.SingleLazyInstance;

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
        AbstractFactory flatColorfulShape = new FlatColorfulShape();
        AbstractFactory thredDimenColorfulShape = new ThredDimenColorfulShape();
        flatColorfulShape.buildColor("blue");
        flatColorfulShape.buildShape("rect");
        thredDimenColorfulShape.buildColor("red");
        thredDimenColorfulShape.buildShape("cylinder");

        //组合模式
        SafeComponent root = new SafeNode("xx公司");
        SafeComponent hr = new SafeNode("人资部");
        SafeComponent software = new SafeNode("软件部");

        SafeComponent android = new SafeLeaf("android");
        SafeComponent ios = new SafeLeaf("ios");

        ((SafeNode)root).addChild(hr);
        ((SafeNode)root).addChild(software);
        ((SafeNode)software).addChild(android);
        ((SafeNode)software).addChild(ios);
    }

    class LazyThread extends Thread{
        @Override
        public void run() {
            SingleLazyInstance singleLazyInstance = SingleLazyInstance.getInstance();
            Log.v("lazy_2022", "instance =" + singleLazyInstance.hashCode());
        }
    }


}

