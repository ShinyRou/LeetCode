package com.zhujun.genericity;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/8/18 10:50
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class SonClass<T>  extends FooClass<T>{

    private T t;
    @Override
    public T getT() {
        return t;
    }
}
