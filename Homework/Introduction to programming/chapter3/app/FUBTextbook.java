package app;

public class FUBTextbook extends Textbook {
    private String faculty;

    public FUBTextbook(String title, String authors) {
        super(title, authors);
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void printFUBTextbook() {
        super.printBook();
        super.printTextbookCourse();
        System.out.println(this.faculty);
    }

    public void printFUBTextbookPrice() {
        super.printBookPrice();
        super.printTextbookCourse();
        System.out.println(this.faculty);
    }
}
