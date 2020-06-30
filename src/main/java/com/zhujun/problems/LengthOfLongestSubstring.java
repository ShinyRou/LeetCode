package com.zhujun.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * className: LengthOfLongestSubstring
 * create by: zhujun
 * description:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * create time: 2019/3/6 17:25
 */

public class LengthOfLongestSubstring {
    /**
     * @Description
     * 思路1
     * 1.字符串转 字符数组
     * 2.通过set集合来 进行判断是否重复，重复的话 记录当前子串长度
     * 3.sum变量 记录最大的长度 返回sum
     * @author zhujun
     * @date 2020/5/25 10:40
     * @param s
     * @return int
     */
    static int  solutions(String s){
        char[] strArray = s.toCharArray();
        int maxLength = 0;//计数器
        Set<Character> strSet = new HashSet<>();
        int sum = strSet.size();
        for(int i=0;i<=strArray.length-1;i++){
            strSet.add(strArray[i]);
            if(sum==strSet.size()){
                i= i - strSet.size();
                strSet.clear();
                sum=strSet.size();
                continue;
            }
            if(maxLength<strSet.size()){
                maxLength = strSet.size();
            }
            sum=strSet.size();
        }
        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(solutions("abcabcbb"));
    }
}
