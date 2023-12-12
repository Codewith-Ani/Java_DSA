package Backtracking.Practice;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(getSubsets(nums));
    }
    private static List<List<Integer>> getSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> vList  = new ArrayList<>();
        subsetsList(result,vList,nums,0);
        return result;
    }

    private static void subsetsList(List<List<Integer>> result, List<Integer> vList, int[] nums, int start) {
        if(!vList.isEmpty())
            result.add(new ArrayList<>(vList));
        for (int i = start; i < nums.length; i++) {
            if(!vList.contains(nums[i])) {
                vList.add(nums[i]);
                subsetsList(result, vList, nums, i + 1);
                vList.remove(vList.size() - 1);
            }
        }
    }
}
