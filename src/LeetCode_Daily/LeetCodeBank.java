package LeetCode_Daily;

public class LeetCodeBank {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(totalMoney(n));
    }

    private static int totalMoney(int n) {
        int totalSavings = 0;
        int monday = 0;
        int otherDays = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 7 == 1) {
                monday++;
                otherDays = monday;
                totalSavings = totalSavings + monday;
            }
            else {
                otherDays++;
                totalSavings = totalSavings +  otherDays;
            }
        }
        return totalSavings;
    }
}