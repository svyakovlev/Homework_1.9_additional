import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] library = new Book[4];
        Book warAndPeace = new Book("Война и мир", "Лев Толстой", 1863);
        Book dunnoOnTheMoon = new Book("Незнайка на Луне", "Николай Носов", 1964);
        printThisBook(warAndPeace);
        addToLibrary(1,warAndPeace);
    }

    public static void addToLibrary(int i, Book book) {
        library[i] = book;
    }
    public static void printThisBook (Book book) {
        System.out.println(book.getBookName() + ": " + book.getAuthor() + ": " + book.getYear());
    }
}