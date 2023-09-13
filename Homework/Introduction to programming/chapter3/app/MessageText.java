package app;

import javax.swing.JOptionPane;

public class MessageText {
    private String code;
    private String text;

    public MessageText() {
        this.code = readLine("code 입력");
        this.text = readLine("text 입력");
    }

    public static String readLine(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public String getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }

}
