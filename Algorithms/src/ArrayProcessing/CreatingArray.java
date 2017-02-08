package ArrayProcessing;

import java.util.Arrays;

/**
 * Created by Andro on 04-Feb-17.
 */
public class CreatingArray {



    public static void main(String[] args) {

        double[] array = new double[10];

        for (int i=0; i<10; i++) {
            array[i] = i;

            System.out.println(array[i]);
            }

        Arrays.sort(array); // Sorting array


        }

    }

