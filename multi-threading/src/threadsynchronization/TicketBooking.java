package threadsynchronization;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBooking {
    private boolean seatBooked;
    int total = 2;

    synchronized boolean bookSeat() throws InterruptedException {
        try {
            if (total > 0) {

                    seatBooked = true;
                    System.out.println("Seat Booked by : " + Thread.currentThread().getName());
                    total--;
                    return true;

            } else {
                System.out.println("Seat already booked");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();

        Runnable task = () -> {
            try {
                ticketBooking.bookSeat();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
    }

}
