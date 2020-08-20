package com.zhujun.genericity;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/8/18 10:27
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class GenericityClass<T extends Object> {
    //属性和方法可以直接使用泛型
    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
