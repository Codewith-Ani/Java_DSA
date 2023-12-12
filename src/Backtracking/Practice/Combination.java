package Backtracking.Practice;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int k = 2;
        System.out.println(combinationList(arr,k));
    }

    private static List<List<Integer>> combinationList(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> vList = new ArrayList<>();
        backtrack(result,vList,arr,k,0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> vList, int[] arr, int k, int idx) {
        if(vList.size() == k) {
            result.add(new ArrayList<>(vList));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
                vList.add(arr[i]);
                backtrack(result, vList, arr, k, i + 1);
                vList.remove(vList.size() - 1);
        }
    }
}