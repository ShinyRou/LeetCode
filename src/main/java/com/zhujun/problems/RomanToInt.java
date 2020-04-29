package com.zhujun.problems;


import java.util.HashMap;
import java.util.Map;

/**
 * 力扣 17题 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

 *
 * 算法思想：
 * 基于hash表 存入所有 罗马数字及 组合对应的值
 * 遍历字符串
 *  1.先看两个字符 能否在hash表中找到对应zhi
 *  2.找不到 再看一个字符
 *
 *

 */
public class RomanToInt {
    public static Integer romanToInt(String s) {
        Map<String, Integer> data = new HashMap<>();
        data.put("I", 1);
        data.put("V", 5);
        data.put("X", 10);
        data.put("L", 50);
        data.put("C", 100);
        data.put("D", 500);
        data.put("M", 1000);
        data.put("IV",4);
        data.put("IX",9);
        data.put("XL",40);
        data.put("XC",90);
        data.put("CD",400);
        data.put("CM",900);
        int ans = 0;
        for(int i=0;i<s.length();){
            if(i+1<s.length()&&data.get(s.substring(i,i+2))!=null){
                ans +=data.get(s.substring(i,i+2));
                i+=2;
            }else{
                ans +=data.get(s.substring(i,i+1));
                i++;
            }
        }
        System.out.println("太难啦 主播做不来啊");
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }



}
