package binarySearch;

/******************************************************************************
 *  Compilation:  javac Whitelist.java
 *  Execution:    java Whitelist whitelist.txt < data.txt
 *  Dependencies: StaticSetOfInts.java In.java StdOut.java
 *
 *  Data files:   http://algs4.cs.princeton.edu/11model/tinyW.txt
 *                http://algs4.cs.princeton.edu/11model/tinyT.txt
 *                http://algs4.cs.princeton.edu/11model/largeW.txt
 *                http://algs4.cs.princeton.edu/11model/largeT.txt
 ******************************************************************************/


import StdLibrary.In;
import StdLibrary.StaticSETofInts;
import StdLibrary.StdIn;
import randomStd.StdOut;

import java.util.Arrays;

public class Whitelist {

    // Do not instantiate.
    private Whitelist() { }

    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a command-line argument. Reads in integers from standard input and
     * prints to standard output those integers that are not in the file.
     *
     * @param args the command-line arguments
     */
        public static void main(String[] args) {

            In in = new In("C:\\Users\\Andro\\workspace\\TXT Files\\SmallList.txt");
            int[] white = in.readAllInts();
            StaticSETofInts set = new StaticSETofInts(white);
            System.out.println(white[14]);
            Arrays.sort(white);

        // Read key fron console, print out if it's not in whitelist.
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (!set.contains(key))
                StdOut.println(key);
        }
    }
}
