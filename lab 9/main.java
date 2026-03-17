class student {
    String name;
    int age;
    static int count = 0;

    student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}

public class main {
    public static void main(String[] args) {
        student s1 = new student("Ali", 18);
        student s2 = new student("Aigerim", 19);
        student s3 = new student("Dias", 20);

        System.out.println("Total students: " + student.count);
    }
}
