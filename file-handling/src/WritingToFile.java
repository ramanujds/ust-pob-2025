import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) {

        FileWriter writer = null;

        try {
            writer = new FileWriter("hello.txt",true);

            writer.write("Some new lines..");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
