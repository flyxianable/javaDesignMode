package com.lyb.designmode.factory.compose;

public class Demo {

    /**
     * 实例化
     */
    public static void toBuild(){

        //组合模式
        SafeComponent root = new SafeNode("xx公司");
        SafeComponent hr = new SafeNode("人资部");
        SafeComponent software = new SafeNode("软件部");

        SafeComponent android = new SafeLeaf("android");
        SafeComponent ios = new SafeLeaf("ios");


        ((SafeNode)software).addChild(android);
        ((SafeNode)software).addChild(ios);

        ((SafeNode)root).addChild(hr);
        ((SafeNode)root).addChild(software);
    }
}
