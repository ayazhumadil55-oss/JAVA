import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String symbol = sc.nextLine();

        System.out.println(text.endsWith(symbol));
    }
}



