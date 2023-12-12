package Backtracking.Practice;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(permutationList(arr));
    }
    private static List<List<Integer>> permutationList(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> vList = new ArrayList<>();

        backtrack(result,vList,arr);
        return result;
    }
    private static void backtrack(List<List<Integer>> result, List<Integer> vList, int[] arr) {
        if(vList.size() == arr.length) {
            result.add(new ArrayList<>(vList));
            return;
        }
        for (int j : arr) {
            if (!vList.contains(j)) {
                vList.add(j);
                backtrack(result, vList, arr);
                vList.remove(vList.size() - 1);
            }
        }
    }
}