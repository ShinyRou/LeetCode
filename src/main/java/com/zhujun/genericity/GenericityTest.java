package com.zhujun.genericity;

import java.util.ArrayList;
import java.util.List;

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
public class GenericityTest {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        forEachPrint(stringList);
    }


    public static void forEachPrint(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
