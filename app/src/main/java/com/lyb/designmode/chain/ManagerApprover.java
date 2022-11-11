package com.lyb.designmode.chain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * 经理
 */
public class ManagerApprover implements Approver {

    public static final String[] blackList = {"Charis", "Jack"};

    List<String> black = Arrays.asList(blackList.clone());

    long overMoney = 1000;

    @Override
    public EnumResult process(Request request) {
        /**
         * 黑名单
         */
        if(black.contains(request.getName())){

            return EnumResult.FAILED;

        }
        /**
         * 大于1千, 交下一个审批
         */
        if(request.getAmount().compareTo(new BigDecimal(overMoney)) > 0 ){

            return EnumResult.FORWARD;

        }

        return EnumResult.PASSED;
    }
}
