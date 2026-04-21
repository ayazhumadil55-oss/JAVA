import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, min;
        System.out.print("Сан енгізіңіз (0 тоқтатады): ");
        min = scanner.nextInt();

        do {
            System.out.print("Сан енгізіңіз (0 тоқтатады): ");
            number = scanner.nextInt();
            if (number != 0 && number < min) {
                min = number;
            }
        } while (number != 0);

        System.out.println("Ең кіші сан: " + min);
    }
}
