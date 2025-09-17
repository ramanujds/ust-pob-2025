package stackqueue;

import java.util.*;

public class OrderProcessing {

    static Queue<String> orderQueue = new LinkedList<>();
    static Deque<String> processedOrders = new LinkedList<>();

    public static void main(String[] args) {

        placeOrder("Order 3 : Coffee");
        placeOrder("Order 1 : Dosa");
        placeOrder("Order 2 : Biriyani");
        placeOrder("Order 4 : Burger");

        while (!orderQueue.isEmpty()){
            processOrder();
        }
        showProcessedOrders();


    }

   static void processOrder(){
        String order = orderQueue.poll();
        System.out.println(order+" Processed");
        processedOrders.push(order);
    }

   static void placeOrder(String order){
        orderQueue.offer(order);
   }

   static void showProcessedOrders(){
        while (!processedOrders.isEmpty()){
            String order = processedOrders.pop();
            System.out.println(order);
        }
   }

}
