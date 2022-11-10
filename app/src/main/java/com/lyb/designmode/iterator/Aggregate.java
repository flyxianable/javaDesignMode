package com.lyb.designmode.iterator;

/**
 * 抽象聚集角色类，这个角色规定出所有的具体聚集必须实现的接口。
 * 迭代器模式要求聚集对象必须有一个工厂方法，也就是createIterator()方法，以向外界提供迭代器对象的实例。
 * 此外，还有方法getElement()向外界提供聚集元素，而方法size()向外界提供聚集的大小等
 */
public abstract class Aggregate {

    public abstract Iterator createIterator();

    public abstract Object getElement(int index);

    public abstract int size();

}
