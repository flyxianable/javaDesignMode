package com.lyb.designmode.strategy;

public class StrategyDemo {

    public void treate(){

        Context contextAdd = new Context(new OperAddStrategy());
        int result1 = contextAdd.execStrategy(6, 2);
        System.out.println("srategy add = " + result1);

        Context contextSub = new Context(new OperSubStrategy());
        int result2 =contextSub.execStrategy(6, 2);
        System.out.println("srategy sub = " + result2);

        Context contextMul = new Context(new OperMulStrategy());
        int result3 = contextMul.execStrategy(6, 2);
        System.out.println("srategy mul = " + result3);

        Context contextDiv = new Context(new OperDivStrategy());
        int result4 = contextDiv.execStrategy(6, 2);
        System.out.println("srategy div = " + result4);

        Context contextMi = new Context(new OperMIStrategy());
        int result5 = contextMi.execStrategy(6, 2);
        System.out.println("srategy mi = " + result5);

    }
}
