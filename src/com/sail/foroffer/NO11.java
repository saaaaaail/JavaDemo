package com.sail.foroffer;

import java.util.Scanner;

/**
 * @program: JavaDemo
 * @description: 旋转数组的最小数字
 * @author: sail
 * @create: 2019/05/30 15:31
 */

public class NO11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(",");
        int[] nums = new int[strs.length];
        for (int i=0;i<strs.length;i++){
            nums[i]=Integer.parseInt(strs[i]);
        }
        System.out.println(min(nums));
    }

    public static int min(int[] nums){
        int i=0;
        int j=nums.length-1;
        if (nums[i]<nums[j]){
            return nums[i];
        }
        while (Math.abs(i-j)!=1){
            int mid = (i+j)/2;
            if (nums[i]==nums[mid]&&nums[mid]==nums[i]){
                int k=i;
                while (nums[k]<nums[k+1]){
                    k++;
                }
                return nums[k+1];
            }
            if (nums[mid]>=nums[i]){
                i=mid;
            }
            if (nums[mid]<=nums[j]){
                j=mid;
            }
        }
        return nums[j];
    }
}
