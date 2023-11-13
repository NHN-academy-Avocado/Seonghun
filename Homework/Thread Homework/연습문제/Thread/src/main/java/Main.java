public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        for (int i = 0; i < 10; i++) {
            Consumer consumer = new Consumer("소비자" + i, store);
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();

        }
    }
}
