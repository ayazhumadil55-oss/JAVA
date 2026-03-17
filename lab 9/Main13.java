class company {
    static class Employee {
        String name;
        String position;

        Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        void display() {
            System.out.println(name + " - " + position);
        }
    }
}

public class Main13 {
    public static void main(String[] args) {
        company c = new company();
        company.Employee e = new company.Employee("Ali", "Manager");
        e.display();
    }
}
class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println(name + " studies " + courseName);
        }
    }
}

