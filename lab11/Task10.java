import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Expression (a+b): ");
        String exp = sc.next();

        String[] parts = exp.split("\\+");

        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);

        System.out.println("Result: " + (a + b));
    }
}


