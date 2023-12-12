package Backtracking.Assignment;

import java.util.ArrayList;
import java.util.List;

public class UniquePermutation {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2};
        System.out.println(getUniquePermutation(arr));
    }

    private static List<List<Integer>> getUniquePermutation(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> vList = new ArrayList<>();
        getUniqueList(arr,result,vList);
        return result;
    }

    private static void getUniqueList(int[] arr,List<List<Integer>> result, List<Integer> vList) {
        if(vList.size() == arr.length && !result.contains(vList)) {
            result.add(new ArrayList<>(vList));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                vList.add(arr[i]);
                int temp = arr[i];
                arr[i] = -1;
                getUniqueList(arr, result, vList);
                vList.remove(vList.size() - 1);
                arr[i] = temp;
            }
        }
    }
}
