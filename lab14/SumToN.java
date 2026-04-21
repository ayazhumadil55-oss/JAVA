import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N енгізіңіз: ");
        int n = scanner.nextInt();

        int sum = 0, i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println(STR."Қосынды: \{sum}");
    }
}



