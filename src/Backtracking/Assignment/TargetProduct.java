package Backtracking.Assignment;

import java.util.ArrayList;
import java.util.List;
public class TargetProduct {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,2,5,4};
        int target = 16;
        System.out.println(isProduct(arr,target));
    }
    private static boolean isProduct(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> vlist = new ArrayList<>();
        getProduct(arr, result,vlist, target,0);
        return !result.isEmpty();
    }
    private static void getProduct(int[] arr, List<List<Integer>> result, List<Integer> vList  , int target, int idx) {
        if (!vList.isEmpty()) {
            int product = 1;
            for (int item : vList) {
                product *= item;
            }
            if (product == target) {
                result.add(new ArrayList<>(vList));
                return;
            }
        }
        for (int i = idx; i < arr.length; i++) {
            vList.add(arr[i]);
            getProduct(arr, result, vList, target, i + 1);
            vList.remove(vList.size() - 1);
        }
    }
}