package com.lyb.designmode.chain;

import java.math.BigDecimal;

/**
 * 通用的请求，它将在责任链上传递
 * 这里是财务审批请求（名称、金额）
 */
public  class Request {

    private String name;

    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {

        this.name = name;

        this.amount = amount;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public void setAmount(BigDecimal amount) {

        this.amount = amount;
    }
}
