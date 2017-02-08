package randomStd;

import draw.StdDraw;

import java.util.Arrays;

/**
 * Created by Andro on 06-Feb-17.
 */
public class ArrayOfRandomValues {

    public static void main(String[] args) {

        int n = 50;
        double[] a = new double[n];

        for (int i = 0; i < n; i++){
            a[i] = StdRandom.uniform();}

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {

            double x =  1.0 * i / n;   // x axis scale 1:50 // coordinate of the upper left corner
            double y = a[i] / 2.0;    // y axis bar height. /2.0 keeps bars grounded//coordinate of the upper left corner
            double rw = 0.45 / n;        // bar width
            double rh = a[i] / 2.0;
          StdDraw.filledRectangle(x, y, rw, rh); // x, y, Half Width, Half Height
           // System.out.println(x + "" + y+ "" + rw+ "" + rh);

        }
    }
}