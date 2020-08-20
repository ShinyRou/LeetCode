package com.zhujun.problems;

/**
 * <p>
 * Description: [
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * </p>
 * Created on 2020/5/26 14:42
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 * Copyright (c) 2020
 **/
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strArray = {"aa","a"};
        System.out.println(longestCommonPrefix(strArray));
    }

    public static  String longestCommonPrefix(String[] strs){
        if(strs!=null&&strs.length>0){
            for(int i=0;i<strs[0].length();i++){
                for(int j= 0;j<strs.length;j++){
                    if(strs[j].length()<=i||strs[0].charAt(i)!=strs[j].charAt(i)){
                        if(i!=0){
                            return strs[0].substring(0,i);
                        }else{
                            return "";
                        }
                    }
                }
            }
            return strs[0];
        }else{
            return "";
        }
    }
}
