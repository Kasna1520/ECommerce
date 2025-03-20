abstract class Book {
    String title;
    public Book(String title) { this.title = title; }
    abstract void displayType();
}
class PrintedBook extends Book {
    public PrintedBook(String title) { super(title); }
    public void displayType() { System.out.println(title + " is a Printed Book"); }
}
class EBook extends Book {
    public EBook(String title) { super(title); }
    public void displayType() { System.out.println(title + " is an E-Book"); }
}
class AudioBook extends Book {
    public AudioBook(String title) { super(title); }
    public void displayType() { System.out.println(title + " is an Audio Book"); }
}
public class Library {
    public static void main(String[] args) {
        Book b1 = new PrintedBook("Java Programming");
        Book b2 = new EBook("Data Science");
        Book b3 = new AudioBook("Machine Learning");
        b1.displayType();
        b2.displayType();
        b3.displayType();
    }
}