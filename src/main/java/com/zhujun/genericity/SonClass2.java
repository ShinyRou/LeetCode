package com.zhujun.genericity;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/8/18 10:52
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class SonClass2 extends FooClass<String>{

    private String data = "this is SonClass2";

    @Override
    public String getT() {
        return data;
    }
}
