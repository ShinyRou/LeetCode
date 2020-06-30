package com.zhujun.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 **/
public class Question2 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder newStr =new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newStr.append("%20");
            }else {
                newStr.append(str.charAt(i));
            }
        }

        return newStr.toString();
    }
}
