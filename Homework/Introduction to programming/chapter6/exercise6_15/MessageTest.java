package exercise6_15;

public class MessageTest {
    public static void main(String[] args) {
        Message message1 = new Message("나", "너", "allohad     wkldfjkse");
        message1.firstCompression();
        System.out.println(message1.getContext());

        Message message2 = new Message("나", "너", "allohad     wkldfjkse");
        message2.secondCompression();
        System.out.println(message2.getContext());

        Message message3 = new Message("나", "너", "allohad     wkldfjkse");
        message3.thirdCompression();
        System.out.println(message3.getContext());
    }
}
