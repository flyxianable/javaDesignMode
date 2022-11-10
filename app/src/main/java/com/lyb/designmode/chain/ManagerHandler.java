package com.lyb.designmode.chain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerHandler implements Handler{

    public static final String[] blackList = {"Charis", "Jack"};
    List<String> black = Arrays.asList(blackList.clone());
    long overMoney = 1000;

    @Override
    public Boolean process(Request request) {
        /**
         * charis三
         */
        if(black.contains(request.getName())){
            return false;
        }
        /**
         * 大于1千, 交下一个审批
         */
        if(request.getAmount().compareTo(new BigDecimal(overMoney)) > 0 ){
            return null;
        }

        return true;
    }
}
