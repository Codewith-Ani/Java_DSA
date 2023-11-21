package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,10,15,27,34,39,45,56};
        int val = 3;
        int result = search(arr, val);
        System.out.println(result);
    }
    public static int search(int[] arr, int value) {
        return b_search(arr,0,arr.length,value);
    }

    public static int b_search(int[] arr, int beg, int end, int value) {
        int result = -1;
        while (beg <  end) {
            int mid = (beg + end) /2;
            if(arr[mid] == value)
                return mid;
            if(arr[mid] > value)
                return b_search(arr, beg, mid - 1, value);
            else
                return b_search(arr, mid + 1, end, value);
        }
        return result;
    }
}
