package com.lyb.designmode.iterator;

/**
 * 具体的聚合类
 * 实现了抽象聚集角色类所要求的接口，也就是createIterator()方法。
 * 此外，还有方法getElement()向外界提供聚集元素，而方法size()向外界提供聚集的大小等。
 *
 */
public class ConcreteAggregate extends Aggregate{

    Object[] arrData;

    public ConcreteAggregate(Object[] arrData) {
        this.arrData = arrData;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 获取集合元素
     * @param index
     * @return
     */
    @Override
    public Object getElement(int index){
        if(arrData == null || arrData.length == 0){
            return  null;
        }
        if(index > -1 && index < arrData.length){
            return  arrData[index];
        }
        return null;
    }

    @Override
    public int size(){
        if(arrData == null){
            return -1;
        }
        return arrData.length;
    }


}
