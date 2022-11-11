package com.lyb.designmode.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 有了不同的Approver后，我们还要把这些Approver组合起来，变成一个链，并通过一个统一入口处理
 */
public class ApproverChain {

    private List<Approver> handlerList = new ArrayList<>();

    public void addHandler(Approver handler){
        handlerList.add(handler);
    }

    public EnumResult process(Request request){

        EnumResult result = null;

        for(Approver handler : handlerList){

            result = handler.process(request);

            //当审核结果是转交时，返回继续下一个循环。
            if(result != EnumResult.FORWARD){

                System.out.println("name is :" + request.getName() + "～amount is :" +  request.getAmount()  + " ～" + ((result == EnumResult.PASSED) ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());

                return  result;
            }

        }

        return result;

    }

}
