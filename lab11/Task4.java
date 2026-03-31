import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Number = ");
            int x = sc.nextInt();
            System.out.println("You entered: " + x);
        } catch (InputMismatchException e) {
            System.out.println("Қате енгізу!");
        }
    }
}



