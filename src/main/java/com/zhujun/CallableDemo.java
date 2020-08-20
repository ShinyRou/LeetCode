package com.zhujun;

import java.sql.PreparedStatement;
import java.util.concurrent.*;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/8/7 10:49
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class CallableDemo {
    public static void main(String[] args) throws Exception{
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5,()-> System.out.println("所有运动员准备就绪"));
        ExecutorService executors = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            executors.submit(()->{
                try {
                    Thread.sleep(100);
                    System.out.println("我准备好了");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }catch (BrokenBarrierException e){
                    e.printStackTrace();
                }
                System.out.println("起飞！");
            });
        }
        executors.shutdown();
    }
}
