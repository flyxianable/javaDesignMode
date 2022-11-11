package com.lyb.designmode.chain;

import java.math.BigDecimal;

public class VPApprover implements Approver {

    long overMoney = 10000;

    @Override
    public EnumResult process(Request request) {

        /**
         * 大于1万的处理不了，交给下一个处理
         */
        if(request.getAmount().compareTo(new BigDecimal(overMoney)) > 0 ){

            return EnumResult.FORWARD;
        }

        return EnumResult.PASSED;
    }
}
