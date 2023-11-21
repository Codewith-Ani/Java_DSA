package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123456;
        int sum = sumOfDigits(n);
        System.out.println(sum);
    }
    public static int sumOfDigits(int n) {
        if(n == 0)
            return 0 ;
        return n % 10 + sumOfDigits(n / 10);
    }
}
