package com.lyb.designmode.iterator;

public class ConcreteIterator implements Iterator{

    //持有被迭代的具体的聚合对象
    private ConcreteAggregate agg;

    //内部索引，记录当前迭代到的索引位置
    private int index = -1;

    //记录当前聚集对象的大小
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate agg) {

        this.agg = agg;

        size = agg.size();

        index = -1;
    }

    @Override
    public boolean hasNext() {

        if(agg.size() > -1 && (index + 1) < agg.size() ){

            return true;
        }

        return false;
    }

    @Override
    public Object next() {

        if(agg.size() == -1){

            return null;
        }

        index ++;

        if(index > -1 && index < agg.size()){

            return agg.getElement(index);
        }

        return null;
    }
}
