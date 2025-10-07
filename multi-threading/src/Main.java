import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class MyTaskManager implements Runnable {


    private List<String> list;

    public MyTaskManager(List<String> list) {
        this.list = list;
    }

    public void run() {
        list.forEach(name -> {
            System.out.println("Processed " + name+" by "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

    }
}


public class Main {


    public static void main(String[] args) {

        System.out.println("Total Processors: " + Runtime.getRuntime().availableProcessors());

        var list1 = List.of("Javed", "Karan", "Harsh", "Mohit", "Lokesh");
        var list2 = List.of("Gaurav", "Amit", "Ayush", "Lakshya");
        var list3 = List.of("Mrinal", "Sovan", "Utsav", "Ritamraj");

        Runnable task1 = new MyTaskManager(list1);
        Runnable task2 = new MyTaskManager(list2);
        Runnable task3 = new MyTaskManager(list3);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();

    }
}