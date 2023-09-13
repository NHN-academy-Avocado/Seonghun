package app;

import javax.swing.JOptionPane;

public class Book {
    private String title;
    private String authors;
    private int price;

    public Book(String title, String authors) {
        this.title = title;
        this.authors = authors;
    }

    public void printBook() {
        System.out.println(this.title);
        System.out.println(this.authors);
    }

    public void printBookPrice() {
        System.out.println(this.title);
        System.out.println(this.authors);
        System.out.println(this.price);
    }

    public void windowBook() {
        JOptionPane.showMessageDialog(null, this.title + "\n" + this.authors);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthors() {
        return this.authors;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}