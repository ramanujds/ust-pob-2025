import java.util.List;

class ThreadWithLambda {

    static void processData(List<String> list) {
        list.forEach(name -> {
            System.out.println("Processed " + name + " by " + Thread.currentThread().getName());
        });
    }

    public static void main(String[] args) throws InterruptedException {

        var list1 = List.of("Javed", "Karan", "Harsh", "Mohit", "Lokesh");
        var list2 = List.of("Gaurav", "Amit", "Ayush", "Lakshya");
        var list3 = List.of("Mrinal", "Sovan", "Utsav", "Ritamraj");

        Thread t0 = new Thread(() -> processData(list1));
        Thread t1 = new Thread(() -> processData(list2));
        Thread t2 = new Thread(() -> processData(list3));

        t0.start();
        t0.join();
        t1.start();
        t2.start();

    }

}