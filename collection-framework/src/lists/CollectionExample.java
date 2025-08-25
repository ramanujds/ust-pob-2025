package lists;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

      List<String> items = new ArrayList<>();


        items.add("Rajiv");
        items.add("Karan");
        items.add("Harsh");
        items.add("Suraj");
        items.add("Amit");

        Collections.sort(items);

        for(String item:items){
            System.out.println(item);
        }




    }

}
