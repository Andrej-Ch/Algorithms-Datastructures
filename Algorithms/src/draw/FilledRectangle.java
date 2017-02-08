package draw;

/**
 * Created by Andro on 06-Feb-17.
 */
public class FilledRectangle {

    public static void main(String[] args) {


        for (int i =0; i<10; i++) {
            double x = i/10;

            double y = i/2.0;

            double rw = 0.5;
            // System.out.println(rw);
            double rh = i/2.0;

            StdDraw.filledRectangle(x, y, rw, rh); // x, y, Half Width, Half Height
        }
    }
}
