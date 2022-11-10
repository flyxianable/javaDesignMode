package com.lyb.designmode.chain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CeoHandler implements Handler{

    public static final String[] whiteList = {"Peter", "HuWen"};
    List<String> white = Arrays.asList(whiteList.clone());
    long overMoney5 = 50000;
    long overMoney2 = 20000;
    @Override
    public Boolean process(Request request) {
        /**
         * 白名单并且小于5万，审批
         */
        if(white.contains(request.getName()) && request.getAmount().compareTo(new BigDecimal(overMoney5)) < 0){
            return true;
        }
        /**
         * 大于2万的不给审批，不在白名单内
         */
        if(request.getAmount().compareTo(new BigDecimal(overMoney2)) > 0 ){
            return false;
        }
        return true;
    }
}
