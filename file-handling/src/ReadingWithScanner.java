import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReadingWithScanner {
    public static void main(String[] args) {
        try {

            File file = new File("hello.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }



        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}