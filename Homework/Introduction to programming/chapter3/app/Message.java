package app;

public class Message {
    private String callNumber;
    private String senderNumber;
    private MessageText messageText;

    public Message(String callNumber, String senderNumber, MessageText messageText) {
        this.messageText = messageText;
        this.callNumber = callNumber;
        this.senderNumber = senderNumber;
    }

    public Message(String senderNumber, MessageText messageText) {
        this.messageText = messageText;
        this.senderNumber = senderNumber;
    }

    public void setCallNumber(MessageText messageText) {
        this.messageText = messageText;
    }

    public void printMessage() {
        System.out.println(this.messageText.getText());
    }
}
