package Recursion;

public class Alternate_Sum {
    public static void main(String[] args) {
        int num = 9;
        int result = alternateSum(num);
        System.out.println(result);
    }
    public static int alternateSum(int num) {
        if(num == 0)
            return 0;
        if(num % 2 == 0) {
            return  alternateSum(num - 1) - num ;
        } else
            return  alternateSum(num - 1) + num;
    }
}
