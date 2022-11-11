package com.lyb.designmode.chain;

import java.math.BigDecimal;

public class ChainDemo {

    public void treat(){

        ApproverChain chain = new ApproverChain();
        chain.addHandler(new ManagerApprover());
        chain.addHandler(new VPApprover());
        chain.addHandler(new CeoApprover());

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
