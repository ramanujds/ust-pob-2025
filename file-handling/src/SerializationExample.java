import java.io.*;

public class SerializationExample {

    public static void serialize(Task task) throws IOException {

        FileOutputStream outputStream = new FileOutputStream("task.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(task);
        System.out.println("Object is saved");
        objectOutputStream.close();
        outputStream.close();

    }

    public static Task deSerialize(String filename) throws IOException, ClassNotFoundException {

        FileInputStream inputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Task task = (Task) objectInputStream.readObject();

        objectInputStream.close();
        inputStream.close();

        return task;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Task task = new Task(1, "Learn Java", true);
//        serialize(task);

        Task task = deSerialize("task.ser");
        System.out.println(task);

    }

}
