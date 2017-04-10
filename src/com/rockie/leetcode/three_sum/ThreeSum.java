package com.rockie.leetcode.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rockie on 2017/4/6.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length - 2;i++) {
            //if same with previous number, then skip
            if(i>0 && nums[i] == nums[i - 1]) {
                continue;
            }

            //search target
            int target = -nums[i];
            int j = i+1;
            int k = nums.length - 1;
            while(j < k) {
                //found target
                if (nums[j] + nums[k] == target) {
                    result.add(Arrays.asList(nums[i],nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if(nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }
}
