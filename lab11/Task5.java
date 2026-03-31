import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 +");
        System.out.println("2 -");
        System.out.println("3 *");
        System.out.println("4 /");

        int choice = sc.nextInt();

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
        }
    }
}


