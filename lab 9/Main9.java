class computer {
    static class Processor {
        double frequency;

        Processor(double frequency) {
            this.frequency = frequency;
        }

        void show() {
            System.out.println("Frequency: " + frequency + " GHz");
        }
    }
}

public class Main9 {
    public static void main(String[] args) {
        computer c = new computer();
        computer.Processor p = new computer.Processor(3.5);
        p.show();
    }
}

class Library {
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

