package Backtracking.Practice;

import java.util.ArrayList;
import java.util.List;

public class LetterPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.isEmpty())
            return result;

        String[] letterMap = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result,new StringBuilder(), digits, letterMap, 0);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder vString, String digits, String[] letterMap, int idx) {
        if(idx == digits.length()) {
            result.add(vString.toString());
            return;
        }
        int number = digits.charAt(idx) - '0';
        String numStr = letterMap[number];

        for (int i = 0; i < numStr.length(); i++) {
            vString.append(numStr.charAt(i));
            backtrack(result, vString, digits, letterMap, idx + 1);
            vString.deleteCharAt(vString.length() - 1);
        }
    }
}