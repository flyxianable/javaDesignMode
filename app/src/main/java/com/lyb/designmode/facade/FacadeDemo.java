package com.lyb.designmode.facade;

public class FacadeDemo {

    public void make(){
        FacadeTeaWaiter facadeTeaWaiter = new FacadeTeaWaiter();
        facadeTeaWaiter.makeTea();
    }
}
