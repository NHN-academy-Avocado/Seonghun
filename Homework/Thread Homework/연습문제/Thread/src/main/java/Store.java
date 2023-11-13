import java.util.NoSuchElementException;

public class Store {
    private final int MAX_STACK = 10;
    private int stackCount = 0;
    private int consumerCount = 0;
    private final int MAX_CONSUMER = 5;

    public Store() {
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
        while (stackCount >= MAX_STACK) {
            wait();
        }
        wait();
        stackCount = 10;
        System.out.println("물건 입고. 현재: " + stackCount + "개");
        notifyAll();
    }

    public synchronized void sell() throws InterruptedException {
        while (stackCount == 0) {
            wait();
        }
        stackCount--;
        System.out.println("물건 판매. 현재 : " + stackCount + "개");
        notifyAll();
    }
}