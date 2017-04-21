package test.com.rockie.leetcode.print_full_arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by rockie on 2017/4/20.
 */
public class Permutation {
    private StringBuilder sb = new StringBuilder();
    protected List<List<Integer>> res = new ArrayList<>();
    protected HashSet<List<Integer>> set = new HashSet<>();

    /**
     * 可能带有重复元素的全排列，使用map。
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteDup(int[] nums) {
        Arrays.sort(nums);
        doPermDup(nums, 0, nums.length);

        return res;
    }

    protected void doPermDup(int[] nums,int i, int j) {
        if (i==j-1) {
            ArrayList<Integer> li = new ArrayList<>();
            for (int x = 0; x < nums.length; x++) {
                li.add(nums[x]);
            }
            res.add(li);
            return;
        }

        for (int k = i; k < j; k++) {
            if(i!= k && nums[i] == nums[k]) {
                continue;
            }

            swap(nums, i, k);
            doPermDup(nums, i+1, j);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(nums, used, list, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i]=true;
            list.add(nums[i]);
            dfs(nums,used,list,res);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        doPerm(nums, 0);
        return res;
    }

    private void doPerm(int[] nums, int k) {
        if (k == nums.length - 1) {
            ArrayList<Integer> li = new ArrayList<>();
            for (int x = 0; x < nums.length; x++) {
                li.add(nums[x]);
            }
            res.add(li);
            return;
        }

        for (int j = k; j < nums.length; j++) {
            swap(nums, k, j);
            perm(nums, k + 1);
            swap(nums, j, k);
        }
    }

    public void printNum(int[] nums, int start) {
        List<String> result = new ArrayList<>();
        if (sb.length() == nums.length) {
            System.out.println(sb.toString());
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                swap(nums, i, j);
                for (int k = 0; k < nums.length; k++) {
                    System.out.print(nums[k]);
                }
                System.out.println();
                swap(nums, j, i);
            }
        }
    }

    public void perm(int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            perm(nums, start + 1);
            swap(nums, i, start);
        }

        if (start == nums.length - 1) {
            System.out.println(Arrays.toString(nums));
        }
    }


    protected void swap(int[] nums, int start, int j) {
        int k = nums[j];
        nums[j] = nums[start];
        nums[start] = k;
    }
}
