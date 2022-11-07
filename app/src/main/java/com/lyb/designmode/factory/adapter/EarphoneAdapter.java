package com.lyb.designmode.factory.adapter;

/**
 * 适配器
 */
public class EarphoneAdapter extends IPhoneSeven implements ITarget{
    @Override
    public String getCorrectEarPhoneInterface() {
        String newInterface = getPhoneInterface();
        return suit(newInterface);
    }

    /**
     * 在这里通过转换器把新接口转换为3.5接口
     * @param newInterface
     * @return
     */
    private String suit(String newInterface){
        return "3.5mm";
    }

}
