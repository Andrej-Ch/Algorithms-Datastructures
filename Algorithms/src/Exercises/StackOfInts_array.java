package Exercises;

import StdLibrary.In;
import StdLibrary.Stack;
import randomStd.StdRandom;

/**
 * Created by Andro on 09-Feb-17.
 */
public class StackOfInts_array {

    public static int uniform(int input) {
        return (int)  (StdRandom.uniform() * (input));
    }


    public static void main(String[] args) {

        int n = 10;                 // stack size
        In in = new In();           //read input for stack size
        int input = in.readInt();   // assign value to input var

        Stack<Integer> stack = new Stack<Integer>();      //create stack

        for (int i = 0; i < n; i++) {               // create random variables
           stack.push(uniform(input+1));
        }

        System.out.println(stack);

        for(Integer wat : stack){               // iterating
            System.out.println("works I guess");
        }

    }
}