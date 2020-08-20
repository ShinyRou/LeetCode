package com.zhujun.test;

import java.math.BigDecimal;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/6/9 9:28
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(-1) ;
        BigDecimal defaultvalue = new BigDecimal(-1);
        Boolean flag = ( defaultvalue.compareTo(a)==0);
        System.out.println(flag);
    }
}
