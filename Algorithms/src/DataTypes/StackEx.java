package DataTypes;

import StdLibrary.Stack;

/**
 * Created by Andro on 08-Feb-17.
 */
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(17);
        stack.push(256);
        int i = stack.pop();
        System.out.println(stack + " " + i);

    }
}
