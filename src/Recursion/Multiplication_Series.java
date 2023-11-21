package Recursion;

public class Multiplication_Series {
    public static void main(String[] args) {
        int n = 8;
        int k = 5;
        print_mul(n,k);
    }
    public static void print_mul(int n, int k) {
        if(k == 1)
            return;
        print_mul(n, k - 1);
        System.out.println(n + " * " + k + " = " + n * k);
    }
}
