package Backtracking.Assignment;

import java.util.ArrayList;
import java.util.List;

public class KSubsets {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,1};
        int k = 2;
        System.out.println(k_subsetSum(arr, k));
    }

    private static boolean k_subsetSum(int[] arr, int k) {

        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }

        if(totalSum%k != 0)
            return false;

        List<Integer> vList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        findSumSubset(arr,k,totalSum/k, vList,result,0);
        for (int j : arr) {
            if (!result.contains(j))
                return false;
        }
        return true;
    }

    private static void findSumSubset(int[] arr, int k, int targetSum, List<Integer> vList,List<Integer> result, int start) {
        if(vList.size() == k) {
            int temp = 0;
            for (int i : vList) {
                temp += i;
            }
            if(temp == targetSum)
                result.addAll(vList);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            vList.add(arr[i]);
            findSumSubset(arr, k, targetSum, vList, result, i + 1);
            vList.remove(vList.size() - 1);
        }
    }
}