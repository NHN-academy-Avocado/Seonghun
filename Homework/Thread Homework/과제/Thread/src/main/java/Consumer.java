import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    private Store store;
    private String name;


    public Consumer(String name, Store store) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            int time = ThreadLocalRandom.current().nextInt(1, 11) * 1000;
            this.store.enter();
            Thread.sleep(time);
            this.store.sell();
            Thread.sleep(time);
            this.store.exit();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}