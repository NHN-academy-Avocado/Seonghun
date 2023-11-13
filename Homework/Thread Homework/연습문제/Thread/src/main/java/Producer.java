import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            while (true) {
                store.buy();
                int time = ThreadLocalRandom.current().nextInt(1, 11) * 10;
                System.out.println("다음 납품까지 " + time + "");
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}