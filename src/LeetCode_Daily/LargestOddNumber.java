package LeetCode_Daily;

public class LargestOddNumber {
    public static void main(String[] args) {
        String n =  "35427";
        System.out.println(largestOddNumber(n));
    }
    public static String largestOddNumber(String num) {
        while (!num.isEmpty()) {
            int lastDigit = num.charAt(num.length() - 1) - '0';
            if (lastDigit % 2 != 0)
                return num;
            else {
                int length = num.length();
                num = num.substring(0, length - 1);
            }
        }
        return "";
    }
}
