package app;

import javax.swing.JOptionPane;

public class ExampleMessage {
    public static void main(String[] args) {
        MessageText messageText = new MessageText();
        Message message = new Message(readLine("번호를 입력"), messageText);
        message.printMessage();
    }

    public static String readLine(String text) {
        return JOptionPane.showInputDialog(text);
    }
}
