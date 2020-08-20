package com.zhujun.test;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/7/13 16:59
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class MyThread extends  Thread{
    @Override
    public void run(){
        System.out.println(this.getName()+" run");
    }


    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        th1.start();
    }
}
