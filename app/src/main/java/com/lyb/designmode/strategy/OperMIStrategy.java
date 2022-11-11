package com.lyb.designmode.strategy;

public class OperMIStrategy implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {

        return (int)Math.pow(num1, num2);
    }
}
