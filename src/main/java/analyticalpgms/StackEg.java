package analyticalpgms;

import java.util.Stack;

public class StackEg {
    public boolean backspaceCompare(String str1, String str2){

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : str1.toCharArray()) {
            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }

        }
        // Convert stack1 to String
        StringBuilder o1 = new StringBuilder();
        for (char ch : stack1) {
            o1.append(ch);
        }
        for (char c : str2.toCharArray()) {
            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }

            }else {
                stack2.push(c);
            }
        }
        // Convert stack2 to String
        StringBuilder o2 = new StringBuilder();
        for (char ch : stack2) {
            o2.append(ch);
        }
        System.out.println(o1.toString() + o2);
        //return o1.toString().equals(o2.toString());
        //optimized return call
        return o1.toString().contentEquals(o2);

    }

    public static void main(String[] args) {
        StackEg s = new StackEg();
        System.out.println(s.backspaceCompare("ab#c", "ad#c"));
        System.out.println(s.backspaceCompare("ab##", "c#d#"));
        System.out.println(s.backspaceCompare("a#c", "b"));
    }
}
