package com.lyb.designmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lyb.designmode.chain.ChainDemo;
import com.lyb.designmode.command.CommandClient;
import com.lyb.designmode.command.audio_player.AudioCommandClient;
import com.lyb.designmode.decorate.DecorateDemo;
import com.lyb.designmode.facade.FacadeDemo;
import com.lyb.designmode.iterator.IteratorDemo;
import com.lyb.designmode.mediator.MediatorDemo;
import com.lyb.designmode.observer.ObserverDemo;
import com.lyb.designmode.proxy.dynamic.DynamicProxyDemo;
import com.lyb.designmode.proxy.static_proxy.StaticProxyDemo;
import com.lyb.designmode.single_instance.SingleLazyInstance;
import com.lyb.designmode.state_pattern.StatePatternDemo;
import com.lyb.designmode.strategy.StrategyDemo;
import com.lyb.designmode.template.TemplateDemo;

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

//        new DynamicProxyDemo().treat();

//        new ObserverDemo().treate();

//        new IteratorDemo().treate();

//        new ChainDemo().treat();

//        new TemplateDemo().treate();

//        new MediatorDemo().treate();

//        new StatePatternDemo().treate();

//        new StrategyDemo().treate();

//        new CommandClient().treate();

        new AudioCommandClient().treate();
    }

    class LazyThread extends Thread{
        @Override
        public void run() {
            SingleLazyInstance singleLazyInstance = SingleLazyInstance.getInstance();
            Log.v("lazy_2022", "instance =" + singleLazyInstance.hashCode());
        }
    }


}

