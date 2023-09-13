package app;

import javax.swing.JOptionPane;

public class ExampleBook2 {
    public static void main(String[] args) {
        FUBTextbook book1 = new FUBTextbook(readLine("제목 입력"), readLine("저자 입력"));
        book1.setCourse(readLine("과정 입력"));
        book1.setFaculty(readLine("학부 입력"));
        book1.printFUBTextbook();

        Book book2 = new Book(readLine("제목 입력"), readLine("저자 입력"));
        Novel book3 = new Novel(book2.getTitle(), book2.getAuthors());
        book3.setType(readLine("유형 입력"));
        book3.printNovelType();

        book1.setPrice(Integer.parseInt(readLine("가격 입력")));
        book1.printFUBTextbookPrice();
    }

    public static String readLine(String text) {
        return JOptionPane.showInputDialog(text);
    }
}
