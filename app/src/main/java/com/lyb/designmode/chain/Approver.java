package com.lyb.designmode.chain;

/**
 * 抽象的处理接口
 */
public interface Approver {

    /**
     * 如果返回Boolean.TRUE，表示处理成功，如果返回Boolean.FALSE，
     *
     * 表示处理失败（请求被拒绝），如果返回null，则交由下一个Handler处理。
     * @param request
     * @return
     */
    EnumResult process(Request request);
}
