import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader("hello.txt");

            BufferedReader reader = new BufferedReader(fileReader);

            reader.lines().forEach(line->System.out.println(line));



        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}