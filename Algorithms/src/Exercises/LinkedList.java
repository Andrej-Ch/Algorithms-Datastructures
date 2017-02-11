package Exercises;

import StdLibrary.Stack;

/**
 * Created by Andro on 11-Feb-17.
 */
public class LinkedList<Item> {


    private static  first;
    private int n;      // number of items

    private class Node{     // nested class
        Item item;
        Node next;
    }

    Node first = new Node();        // create node for each item
    Node second = new Node();
    Node third = new Node();




    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        first.item = "to";          // set item field to value
        second.item = "be";
        third.item = "or";

        first.next = second;        // set links(references)
        second.next = third;

    }
}
