package Exercises;

import StdLibrary.In;
import randomStd.StdOut;

/**
 * Created by Andro on 09-Feb-17.
 */
public class StdReadConsole {

    public static void main(String[] args) {

        In read = new In();
        int input = read.readInt();
        StdOut.println(input);

    }
}
