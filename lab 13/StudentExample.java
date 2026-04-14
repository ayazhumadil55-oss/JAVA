import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentExample {
    public static void main(String[] args) {
        List<student> students = Arrays.asList(
                new student("John", 20, 85),
                new student("Jane", 22, 92),
                new student("Jack", 20, 78)
        );

        // Бағасы > 80 студенттерді сүзу
        List<student> filteredStudents = students.stream()
                .filter(student -> student.getGrade() > 80)
                .sorted(Comparator.comparing(student::getName))
                .toList();

        filteredStudents.forEach(System.out::println);  // Jane, John
    }
}



