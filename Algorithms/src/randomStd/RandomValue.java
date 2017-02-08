package randomStd;

/**
 * Created by Andro on 06-Feb-17.
 */
public class RandomValue {


    public static int uniform(int n){

        return (int)  (StdRandom.uniform() * (n));
    }

    public static void main(String[] args) {

        //uniform(5);
        System.out.println(uniform(55));



    }
}