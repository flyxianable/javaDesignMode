package com.lyb.designmode.factory.simple;

import android.util.Log;
import android.widget.Toast;

public class CircleShap implements Shape{

    public CircleShap() {
        System.out.println("create a circle class");
    }

    @Override
    public void draw() {
        System.out.println("draw a circle");
    }
}
