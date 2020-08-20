package com.zhujun.test;

import java.util.concurrent.CountDownLatch;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/8/12 10:21
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class test {
    public static void main(String[] args) throws InterruptedException {
        final Test test = new Test();
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(){
                public void run(){
                    try{
                        for (int j = 0; j < 1000; j++)
                            test.increase();
                    }catch(Exception e){
                        e.printStackTrace();
                    }finally {
                        countDownLatch.countDown();
                    }

                };
            }.start();
        }
        countDownLatch.await();
        System.out.println(test.inc);
    }

    public static class Test {
        public volatile int inc = 0;

        public void increase() {
            inc++;
        }

        public void matseremo(){};
    }


}
