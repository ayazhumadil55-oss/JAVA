class libraryy {
    class Book {
        String title;

        Book(String title) {
            this.title = title;
        }

        void show() {
            System.out.println("Book: " + title);
        }
    }
}

public class Main10 {
    public static void main(String[] args) {
        libraryy lib = new libraryy();
        libraryy.Book book = lib.new Book("Java Basics");
        book.show();
    }
}
