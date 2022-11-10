package com.lyb.designmode.chain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class VPHandler implements Handler{


    long overMoney = 10000;

    @Override
    public Boolean process(Request request) {
        /**
         * 大于1万的处理不了，交给下一个处理
         */
        if(request.getAmount().compareTo(new BigDecimal(overMoney)) > 0 ){
            return null;
        }

        return true;
    }
}
