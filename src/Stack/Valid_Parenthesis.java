package Stack;

import java.util.Stack;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        String str = ")])]";
        System.out.println("Is the parenthesis string valid? " + isValid(str));
    }

    public static boolean isValid(String str) {
        char[] chars= str.toCharArray();
        Stack<Character> vStack = new Stack<>();
        for(char c  : chars) {
            if (c == '{' || c == '[' || c == '(')
                vStack.push(c);
            else {
                if (vStack.isEmpty())
                    return false;
                else {
                    char top = vStack.pop();
                    if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']'))
                        return false;
                }
            }
        }
        return vStack.isEmpty();
    }
}
