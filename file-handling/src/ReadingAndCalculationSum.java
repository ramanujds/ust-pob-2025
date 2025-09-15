import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndCalculationSum {

    public static void main(String[] args) {

        try {


            File file1 =new File("numbers.txt");
            String content = "";
            Scanner scanner1 = new Scanner(file1);
            while (scanner1.hasNext()){
                content += scanner1.nextLine();
            }


//           int sum = Arrays.stream(line.split(",")).mapToInt(n->Integer.parseInt(n)).filter(n->n%2!=0).sum();

            String[] nums = content.split("[, ]+");
            int sum = 0;
            for (String s:nums){
                int i= Integer.parseInt(s);
                if (i%2 !=0){
                    sum+=i;
                }
            }


            System.out.println(sum);



        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    }


