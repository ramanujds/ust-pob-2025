package stringexample;

import java.util.regex.Pattern;

public class RegExExample {

    public static void main(String[] args) {

        String pattern = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$])[a-zA-Z0-9@#$]{6,20}$";

        String input = "AA1@DAa";


        var output = input.matches(pattern);

        System.out.println(output);


    }

}
