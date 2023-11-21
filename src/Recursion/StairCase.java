package Recursion;

public class StairCase {
    public static void main(String[] args) {
        int total_stairs = 45;
        int result = calculate_ways(total_stairs);
        System.out.println(result);
    }
    public static int calculate_ways(int total_stairs) {
        if(total_stairs == 1)
            return 1;
        if(total_stairs == 2)
            return 2;
        return calculate_ways(total_stairs - 1) + calculate_ways(total_stairs - 2);
    }
}