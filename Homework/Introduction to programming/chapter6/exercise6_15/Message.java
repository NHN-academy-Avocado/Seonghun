package exercise6_15;

public class Message {
    private String sender;
    private String receiver;
    private String context;

    public Message(String sender, String receiver, String context) {
        this.sender = sender;
        this.receiver = receiver;
        this.context = context;
    }

    public String getSender() {
        return this.sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public String getContext() {
        return this.context;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void changer() {
        String temp = this.receiver;
        this.receiver = this.sender;
        this.sender = temp;
    }

    public void firstCompression() {
        String[] temp = this.context.split("\\s+");
        String result = "";
        for (String str : temp) {
            result += (str + " ");
        }
        result.substring(0, result.length()-1);
        this.context = result;
    }

    public void secondCompression() {
        String result = "";
        int len = this.context.length();
        for (int i = 0; i < len; i++) {
            if (this.context.charAt(i) == 'a' || this.context.charAt(i) == 'e' || this.context.charAt(i) == 'i' || this.context.charAt(i) == 'o' || this.context.charAt(i) == 'u') {
                continue;
            }
            result += this.context.charAt(i);
        }
        this.context = result;
    }

    public void thirdCompression() {
        firstCompression();
        secondCompression();
    }

    
}
