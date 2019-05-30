package com.sail.foroffer;

import java.util.Scanner;

/**
 * @program: JavaDemo
 * @description: 二维数组中的查找
 * @author: sail
 * @create: 2019/05/30 10:53
 */

public class NO4 {
    static int M;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M=Integer.parseInt(sc.nextLine());
        N=Integer.parseInt(sc.nextLine());
        String[] strs;
        int[][] nums = new int[M][N];
        for (int j=0;j<M;j++){
            strs = sc.nextLine().split(",");
            for (int i=0;i<N;i++){
                nums[j][i]=Integer.parseInt(strs[i]);
            }
        }

        System.out.println(search(nums,5));
    }

    public static boolean search(int[][] nums,int target){
        for (int i=0;i<nums.length;i++){
            for (int j=nums[0].length-1;j>=0;j--){
                if (target>nums[i][j]){
                    break;
                }else if (target==nums[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
