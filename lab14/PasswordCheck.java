import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if (password.length() >= 6) {
            System.out.println("Құпиясөз дұрыс");
        } else {
            System.out.println("Құпиясөз тым қысқа");
        }
    }
}