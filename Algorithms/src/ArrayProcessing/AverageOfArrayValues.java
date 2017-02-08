package ArrayProcessing;

/**
 * Created by Andrej Ch. on 04-Feb-17.
 */
public class AverageOfArrayValues {

    public static void main(String[] args) {

        int[] array = {2, 8, 5, 17, 1};  // init array
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum  += array[i];                      // sum it up
            double average = sum / array.length;  // calc average

            System.out.println( average);
        }

    }
}
