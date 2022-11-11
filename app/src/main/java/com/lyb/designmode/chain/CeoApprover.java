package com.lyb.designmode.chain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CeoApprover implements Approver {

    public static final String[] whiteList = {"Peter", "HuWen"};

    List<String> white = Arrays.asList(whiteList.clone());

    long overMoney5 = 50000;

    long overMoney2 = 20000;
    @Override
    public EnumResult process(Request request) {
        /**
         * 白名单并且小于5万，审批通过
         */
        if(white.contains(request.getName()) && request.getAmount().compareTo(new BigDecimal(overMoney5)) < 0){

            return EnumResult.PASSED;
        }
        /**
         * 大于2万的审批不通过，不在白名单内
         */
        if(request.getAmount().compareTo(new BigDecimal(overMoney2)) > 0 ){

            return EnumResult.FAILED;

        }
        return EnumResult.PASSED;
    }
}
