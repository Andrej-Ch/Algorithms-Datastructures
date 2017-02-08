package binarySearch;

import StdLibrary.In;
import StdLibrary.StdIn;
import randomStd.StdOut;

import java.util.Arrays;

/**
 * Created by Andro on 06-Feb-17.
 */

    /**
     * Created by Andro on 06-Feb-17.
     */
    public class BinarySearchAlgorithm {

        private BinarySearchAlgorithm() {
        }

        public static int indexOf(int[] a, int key) {

            int low = 0;
            int hi = a.length - 1;

            while (low <= hi) {
                 int mid = low + (hi - low) / 2;
                if (key < a[mid]) {hi = mid - 1;}
                else if (key > a[mid]){ low = mid + 1;}
                else{
                    System.out.println("index of searched number is: " + mid);
                    return mid;
                }
            }
            return -1;  //  key not in the list
        }


        public static int rank(int[] a, int key) {
            return indexOf(a, key);
        }

        public static void main(String[] args) {

            // read integers from a file
            In in = new In("C:\\Users\\Andro\\workspace\\TXT Files\\LargeList.txt");
            int[] whitelist = in.readAllInts();

            // sort the array
            Arrays.sort(whitelist);

            // Read key from console, print out if it's not in whitelist.
            while (!StdIn.isEmpty()) {
                int key = StdIn.readInt();
                if (rank(whitelist, key) == -1)
                    StdOut.println(key + " is not on the list");
            }
        }
    }
