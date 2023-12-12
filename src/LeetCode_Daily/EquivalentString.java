package LeetCode_Daily;

public class EquivalentString {
    public static void main(String[] args) {
        String[] word1 = new String[]{"a", "cb"};
        String[] word2 = new String[]{"ab", "c"};
        Boolean result = arrayStringsAreEqual(word1,word2);
        System.out.println(result);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        for(String s : word1)
            temp1.append(s);
        for(String s : word2)
            temp2.append(s);

        return temp1.toString().contentEquals(temp2);
    }
}