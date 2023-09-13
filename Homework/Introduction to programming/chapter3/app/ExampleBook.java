package app;

import javax.swing.JOptionPane;

public class ExampleBook {
    public static void main(String[] args) {
        String title1 = readLine("첫번째 제목 입력");
        String author1 = readLine("첫번째 author 입력");
        Book book1 = new Book(title1, author1);
        String title2 = readLine("두번째 제목 입력");
        String author2 = readLine("두번째 author 입력");
        Book book2 = new Book(title2, author2);
        book1.printBook();
        book2.printBook();
        int price1 = Integer.parseInt(readLine("price 입력"));
        book1.setPrice(price1);
        book1.printBookPrice();
    }

    public static String readLine(String text) {
        return JOptionPane.showInputDialog(text);
    }

}