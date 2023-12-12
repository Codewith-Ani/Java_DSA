/**
 * WAP to take an array of integers and return a list of all the combinations with sum = 5
 * INPUT : ARR - [1,2,3,1] SUM - 4
 * OUTPUT : [1,3] [1,2,1] [3,1]
 */

package Backtracking.Practice;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int sum = 4;
        int[] arr = new int[]{1,2,3,1};
        System.out.println(SubsetList(arr,sum));
    }
    public static List<List<Integer>> SubsetList(int[] arr, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> vList = new ArrayList<>();
        backtrack(result,vList,arr,sum,0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> vList, int[] arr, int sum, int idx) {
        if(!vList.isEmpty()) {
            int list_sum = 0;
            for (int i : vList)
                list_sum = list_sum + i;
            if(list_sum > sum || (vList.size() == arr.length && list_sum < sum))
                return;
            if(list_sum == sum) {
                result.add(new ArrayList<>(vList));
                return;
            }
        }
        for (int i = idx; i < arr.length; i++) {
            vList.add(arr[i]);
            backtrack(result, vList, arr, sum, i + 1);
            vList.remove(vList.size() - 1);
        }
    }
}