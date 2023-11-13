import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    private final int MAX_STACK = 10;
    private int stackCount = 0;
    private int consumerCount = 0;
    private final int MAX_CONSUMER = 5;
    private HashMap<String, Semaphore> counterSemaphore = new HashMap<>();
    private HashMap<String, Integer> stack = new HashMap<>();

    public Store() {
        for (Thing x : Thing.values()) {
            stack.put(x.name(), 0);
            counterSemaphore.put(x.name(), new Semaphore(1));
        }
    }

    public synchronized void enter() throws InterruptedException {
        while (consumerCount >= MAX_CONSUMER) {
            wait();
        }
        consumerCount++;
        System.out.println("고객 입장. 현재: " + consumerCount + "명");
        notifyAll();
    }

    public synchronized void exit() {
        if (consumerCount <= 0) {
            throw new NoSuchElementException("고객이 없는데 exit 작동");
        }
        consumerCount--;
        System.out.println("고객 퇴장. 현재: " + consumerCount + "명");
        notifyAll();
    }

    public synchronized void buy() throws InterruptedException {
        while (stackCount != 10) {
            int randomNumber = ThreadLocalRandom.current().nextInt(Thing.values().length);
            stack.put(Thing.values()[randomNumber].name(), stack.get(Thing.values()[randomNumber].name()) + 1);
            stackCount++;
            notifyAll();
        }
        System.out.println("물건 입고 완료.");
    }

    public void sell() throws InterruptedException {
        int randomNumber = ThreadLocalRandom.current().nextInt(Thing.values().length);
        while (stack.get(Thing.values()[randomNumber].name()) == 0) {
            randomNumber = ThreadLocalRandom.current().nextInt(Thing.values().length);
        }
        counterSemaphore.get(Thing.values()[randomNumber].name()).acquire();
        stack.put(Thing.values()[randomNumber].name(), stack.get(Thing.values()[randomNumber].name()) - 1);
        stackCount--;
        System.out.println(
                "물건 판매. 현재 : " + stack.get(Thing.values()[0].name()) + "" + stack.get(Thing.values()[1].name()) + "" +
                        stack.get(Thing.values()[2].name()));
        counterSemaphore.get(Thing.values()[randomNumber].name()).release();
    }
}