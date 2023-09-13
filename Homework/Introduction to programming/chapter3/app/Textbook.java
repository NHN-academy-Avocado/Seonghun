package app;

public class Textbook extends Book {
    private String course;

    public Textbook(String title, String authors) {
        super(title, authors);
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void printTextbookCourse() {
        System.out.println(this.course);
    }
}
