package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int result = factorial_num(num);
        System.out.println(result);
    }
    public static int factorial_num(int num) {
        if(num == 0 || num == 1 )
            return 1;

        return num * factorial_num(num - 1);
    }
}
