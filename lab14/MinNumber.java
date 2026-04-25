import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // қанша сан енгізіледі
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Ең кіші сан: " + min);
    }
}