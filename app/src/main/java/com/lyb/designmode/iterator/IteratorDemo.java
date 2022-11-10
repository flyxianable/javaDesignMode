package com.lyb.designmode.iterator;

public class IteratorDemo {

    public void treate(){

        Object[] data = {"one", "two", "three", "four", "five", "six"};

        ConcreteAggregate agg = new ConcreteAggregate(data);

        Iterator iterator = agg.createIterator();

        while (iterator.hasNext()){

            System.out.println("item = " +  iterator.next());
        }
    }
}
