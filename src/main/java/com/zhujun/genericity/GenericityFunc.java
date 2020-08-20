package com.zhujun.genericity;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/8/18 10:31
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class GenericityFunc {

    /*public <T> void print(T t){
        System.out.println(t.toString());
    }*/

    public  static <T> void print(T t){
        System.out.println(t);
    }
}
