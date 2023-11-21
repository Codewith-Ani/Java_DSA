package Recursion;

public class PowerCalculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 32;
        long result = calculate_power(a,b);
        System.out.println(result);
    }
    public static long calculate_power(int a, int b) {
        int result = 0;
        if(b == 1)
         return a;
        if(b % 2 == 0)
            return calculate_power(a, b / 2) * calculate_power(a, b / 2);
        else
            return a * calculate_power(a, b / 2) * calculate_power(a, b / 2);
    }
}
