package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> myQueue = new PriorityQueue<>();

        myQueue.offer("Javed");
        myQueue.offer("Harsh");
        myQueue.offer("Karana");
        myQueue.offer("Amit");

       while (!myQueue.isEmpty()){
           System.out.println(myQueue.poll());
       }


    }

}
