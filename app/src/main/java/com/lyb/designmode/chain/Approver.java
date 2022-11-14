package com.lyb.designmode.chain;

/**
 * 抽象的处理接口
 */
public interface Approver {

    /**
     *
     * @param request
     * @return
     */
    EnumResult process(Request request);
}
