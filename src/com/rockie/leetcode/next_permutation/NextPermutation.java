package com.rockie.leetcode.next_permutation;

import java.util.Arrays;

/**
 * Created by rockie on 2017/4/20.
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // 第一个升序swap，全降序则反转
        int i = nums.length - 1;
        for (; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                break;
            }
        }

        if(i>0) {
            swap(nums, i-1);
        }

        revert(nums, i);
    }

    protected void revert(int[] nums, int start) {
        int end = nums.length-1;
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end --;
        }
    }

    protected void swap(int[] nums, int i) {
        for(int j = nums.length -1;j>i;j--) {
            if(nums[j]>nums[i]) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                break;
            }
        }
    }
}
