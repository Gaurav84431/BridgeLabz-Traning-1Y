class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public void display() {
        System.out.println(ISBN + " " + title + " " + getAuthor());
    }
}

public class Main2 {
    public static void main(String[] args) {
        EBook b = new EBook();
        b.ISBN = "12345";
        b.title = "Java";
        b.setAuthor("James");
        b.display();
    }
}