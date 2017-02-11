package Exercises;

import randomStd.StdRandom;

/**
 * Created by Andro on 11-Feb-17.
 */
public class ReturnRandomValue {

    public static int random;


    public static int uniform(int n) {

        return (int)  (StdRandom.uniform() * (n));

        //return random.nextInt(n);
    }

    public static void main(String[] args) {

        int input = 3;

        System.out.println(uniform(26));

    }
}
