package com.lyb.designmode.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 有了不同的Handler后，我们还要把这些Handler组合起来，变成一个链，并通过一个统一入口处理
 */
public class HandleChain {

    private List<Handler> handlerList = new ArrayList<>();

    public void addHandler(Handler handler){
        handlerList.add(handler);
    }

    public boolean process(Request request){
        for(Handler handler : handlerList){
            Boolean result = handler.process(request);
            if(result != null){
                System.out.println("name is :" + request.getName() + "～amount is :" +  request.getAmount()  + " ～" + (result ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
                return  result;
            }
        }
        return false;
    }

}
