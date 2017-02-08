package DataTypes;


import StdLibrary.Queue;

/**
 * Created by Andro on 08-Feb-17.
 */
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> que = new Queue<Integer>();
        que.enqueue(17);
        que.enqueue(18);
        que.enqueue(19);

        int i = que.dequeue();

        System.out.println(i);
    }
}
