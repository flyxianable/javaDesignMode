package com.lyb.designmode.facade;

/**
 * 外观类
 * 这里就是茶馆的服务员
 * 茶具、茶叶、开水、泡茶这些子系统的制备过程都由他来完成，客人不用关心具体细节，只要叫一声"小二，来一壶茶"，就完事了。
 * 这里隐藏了具体泡什么茶的细节（比如西湖、龙井等等）
 */
public class FacadeTeaWaiter {
    private TeaSet teaSet;
    private TeaLeaf teaLeaf;
    private Water water;
    private SteepTea steepTea;


    public FacadeTeaWaiter() {
        teaSet = new TeaSet();
        teaLeaf = new TeaLeaf();
        water = new Water();
        steepTea = new SteepTea();
    }

    public void makeTea(){
        teaSet.make();
        teaLeaf.make();
        water.make();
        steepTea.make();
    }
}
