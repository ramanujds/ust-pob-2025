package lists;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

      List<String> items = new ArrayList<>();

        items.add("Rajiv");
        items.add("Karan");

        items.remove("Karan");

        items.add(1,"Harsh");






        for(String item:items){
            System.out.println(item);
        }


    }

}
