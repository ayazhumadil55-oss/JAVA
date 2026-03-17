class Universityy {
    static int studentCount = 0;

    static void addStudent() {
        studentCount++;
    }
}

public class Main15 {
    public static void main(String[] args) {
        University.addStudent();
        University.addStudent();
        University.addStudent();

        System.out.println("Total students: " + University.studentCount);
    }
}