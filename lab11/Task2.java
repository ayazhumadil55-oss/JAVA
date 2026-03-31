import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        double x = sc.nextDouble();

        if (x < 0) {
            System.out.println("Теріс сан!");
        } else {
            System.out.println("Result: " + Math.sqrt(x));
        }
    }
}



