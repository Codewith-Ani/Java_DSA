package Backtracking.Practice;

import java.util.ArrayList;
import java.util.List;

/*
 * WAP to find all possible arrangements of three Students [A,B,C] following the rules:-
 * - Student B should not sit in between A & C
 *
 * All Combinations - [A,B,C],[A,C,B],[B,A,C],[B,C,A],[C,A,B],[C,B,A]
 * Output based on Rule - [A,C,B],[B,A,C],[B,C,A],[C,A,B]
 */
public class Arrangement_1 {
    public static void main(String[] args) {
        String[] students = new String[]{"A", "B", "C"};
        System.out.println(waysToSit(students));
    }

    private static List<List<String>>  waysToSit(String[] students) {
        List<List<String>> result = new ArrayList<>();
        List<String> vList  = new ArrayList<>();

        backtrack(result,vList,students);
        return result;
    }

    private static void backtrack(List<List<String>> result, List<String> vList,String[] students) {
        if(vList.indexOf("B") == 1)
            return;

        if(vList.size() == students.length) {
            result.add(new ArrayList<>(vList));
            return;
        }
        for (String student : students) {
            if (!vList.contains(student)) {
                vList.add(student);
                backtrack(result, vList, students);
                vList.remove(vList.size() - 1);
            }
        }
    }
}