class university {
    class Student {
        String name;
        String major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void display() {
            System.out.println(name + " - " + major);
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        university u = new university();
        university.Student s = u.new Student("Ali", "IT");
        s.display();
    }
}

class Computer {
    class Processor {
        double frequency;

        Processor(double frequency) {
            this.frequency = frequency;
        }

        void show() {
            System.out.println("Frequency: " + frequency + " GHz");
        }
    }
}

