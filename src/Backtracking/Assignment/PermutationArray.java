package Backtracking.Assignment;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(permutation(arr));
    }

    private static List<List<Integer>> permutation(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> vList= new ArrayList<>();
        getPermutationList(arr,result,vList);
        return result;
    }

    private static void getPermutationList(int[] arr, List<List<Integer>> result, List<Integer> vList) {
        if(vList.size() == arr.length) {
            result.add(new ArrayList<>(vList));
            return;
        }
        for(int i: arr) {
            if(!vList.contains(i)) {
                vList.add(i);
                getPermutationList(arr, result, vList);
                vList.remove(vList.size() - 1);
            }
        }
    }
}
