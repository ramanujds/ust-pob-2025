package revision;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

record User(String name, String email, String location)  implements Comparable<User>{
    @Override
    public int compareTo(User u) {
        return this.name.compareTo(u.name);
    }
}

public class SetTest {

    public static void main(String[] args) {

        Map<String,User> users = Map.of(
                "Alice", new User("Alice", "alice@yahoo.com", "NY"),
                "Bob", new User("Bob", "bob@gmail.com", "LA"),
                "Charlie", new User("Charlie", "charlie@yahoo.com", "SF"),
                "David", new User("David", "david@yahoo.com", "NY")
        );


        // Find user with name "Bob"
//        var user = users.get("Bob");
//        System.out.println(user);

        List<User> list = users.values().stream().toList();

        List<User> sortedList = list.stream().sorted().toList();

        sortedList.forEach(System.out::println);



    }

}
