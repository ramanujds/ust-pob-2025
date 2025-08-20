import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        File file = new File("abc.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String content = scanner.nextLine();
                System.out.println(content);
            }
        }
        catch (IOException ex){
            System.err.println("Error : "+ex.getMessage());
        }


    }

}
