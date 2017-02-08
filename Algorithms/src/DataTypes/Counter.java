package DataTypes;

import randomStd.StdOut;

/**
 * Created by Andro on 08-Feb-17.
 */
public class Counter {

    private final String name;
    private int count;

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    public String toString(){
        return count + " " + name;
    }

    public Counter(String id){
        name = id;
    }


    public static void main(String[] args) {

        Counter heads = new Counter("heads");   // create new object (invoke constructor)
        Counter tails = new Counter("tails");

        heads.increment(); // call method .increment()
        heads.increment();
        tails.increment();

        StdOut.println(heads + " " + tails);
        StdOut.println(heads.tally() - tails.tally());

    }
}
