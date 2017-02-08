package draw;

//import java.lang.Object.StdDraw;
//import stddraw.StdDraw;
/**
 * Created by AndrejCh on 06-Feb-17.
 */
public class Basics {



    public static void main(String[] args) {
        int n = 100;
        StdDraw.setXscale(0,n);     // scale
        StdDraw.setYscale(0, n*n);
        StdDraw.setPenRadius(0.01);  // pen thickness
        for (int i = 0; i <= n; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i*Math.log(i));


        }
    }
}
