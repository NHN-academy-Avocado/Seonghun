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
            this.store.enter();
            this.store.sell();
            this.store.exit();
            System.out.println(name + "님이 구매 완료 후 퇴장");

            int time = ThreadLocalRandom.current().nextInt(1, 11) * 5000;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}