package com.lyb.designmode.chain;

import java.math.BigDecimal;

public class ChainDemo {

    public void treat(){

        HandleChain chain = new HandleChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new VPHandler());
        chain.addHandler(new CeoHandler());

        chain.process(new Request("wike", new BigDecimal(500)));
        chain.process(new Request("Charis", new BigDecimal(1000)));
        chain.process(new Request("Charis", new BigDecimal(20000)));
        chain.process(new Request("keke", new BigDecimal(10000)));
        chain.process(new Request("dong", new BigDecimal(20000)));
        chain.process(new Request("Coco", new BigDecimal(30000)));
        chain.process(new Request("Peter", new BigDecimal(30000)));
        chain.process(new Request("HuWen", new BigDecimal(80000)));

    }
}
