package ArrayProcessing;

/**
 * Created by Andrej Ch. on 04-Feb-17.
 */
public class CopyToAnotherArray {

    public static void main(String[] args) {

        double[] array1 = {1,2,3,4,5};
        double[] array2 = new double[array1.length];

        for (int i = 0; i < array1.length; i++){

            array2[i] = array1[i];

        System.out.println(array2[i]);
        }
    }
}
