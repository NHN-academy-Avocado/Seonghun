package app;

public class Novel extends Book {
    private String type;

    public Novel(String title, String authors) {
        super(title, authors);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printNovelType() {
        super.printBook();
        System.out.println(this.type);
    }
}
