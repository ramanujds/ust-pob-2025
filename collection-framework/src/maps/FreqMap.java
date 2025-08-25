package maps;

import java.util.*;

public class FreqMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> freqMap = new HashMap<>();

        var chars = str.toCharArray();
        for (var c : chars) {
            int current = freqMap.getOrDefault(c, 0);
            freqMap.put(c, current+1);
        }

        for (var key:freqMap.keySet()){
            System.out.println(key+" -> "+freqMap.get(key));
        }

    }

}
