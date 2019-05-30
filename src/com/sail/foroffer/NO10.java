package com.sail.foroffer;

/**
 * @program: JavaDemo
 * @description: 斐波那契数列
 * @author: sail
 * @create: 2019/05/30 15:03
 */

public class NO10 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(2));
    }

    public static Integer Fibonacci(Integer n){
        /**
         * f(n)=f(n-1)+f(n-2)
         */
        int pre=0;
        int post=1;
        int tmp=0;
        for (int i=2;i<=n;i++){
            tmp = pre+post;
            pre = post;
            post=tmp;
        }
        return tmp;
    }
}
