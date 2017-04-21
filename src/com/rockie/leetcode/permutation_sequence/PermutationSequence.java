package com.rockie.leetcode.permutation_sequence;

/**
 * Created by rockie on 2017/4/20.
 * 1234->
 * 1 + perm(234)  count = 6
 * 2 + perm(134)  count = 6
 * 3 + perm(124)  count = 6
 * 4 + perm(123)  count = 6
 *
 * if you look for 14th, it should be in row 2
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i=1 ;i<=n;i++) {
            nums[i-1] = i;
        }

        for(int j =1;j<k;j++) {
            nextPermutation(nums);
        }

        StringBuilder sb = new StringBuilder();
        for(int m =0;m<nums.length;m++) {
            sb.append(nums[m]);
        }

        return sb.toString();
    }

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
