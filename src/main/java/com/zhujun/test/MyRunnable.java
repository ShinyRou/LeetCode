package com.zhujun.test;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/7/13 17:01
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("thread run");
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunnable());
        th1.start();
    }
}
