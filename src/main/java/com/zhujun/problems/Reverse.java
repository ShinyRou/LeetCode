package com.zhujun.problems;

/**
 * className: Reverse
 * create by: zhujun
 * description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * create time: 2019/3/7 15:16
 */
public class Reverse {
    public static int reverse(int x) {
        String str = String.valueOf(x);
        boolean flag = false;
        if(str.contains("-")){
            str = str.substring(1);
            flag= true;
        }
        char [] ch = str.toCharArray();
        for(int i= 0;i<ch.length/2;i++){
            char t = ch[ch.length-1-i];
            ch[ch.length-1-i] = ch[i];
            ch[i] = t;
        }

        str = String.valueOf(ch);
        int y;
        try {
            y= Integer.parseInt(str);
        }catch (Exception e){
            y = 0;
        }

        if(flag==true){
            y= -y;
        }
        return y;
    }


    public static int reverse2(int x){
        int rev = 0;

        while(x!=0){

            try{
                int pop = + x%10;
                rev = rev*10+pop;
                x = x/10;
            }catch (Exception e){
                return 0;
            }





        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse2(
                1534236469));

    }
}
