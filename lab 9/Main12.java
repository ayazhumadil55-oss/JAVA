class bankk {
    static double interestRate = 0.1;

    static double calculateInterest(double amount) {
        return amount * interestRate;
    }
}

public class Main12 {
    public static void main(String[] args) {
        System.out.println(bankk.calculateInterest(1000));
    }
}
class Company {
    static class Employee {
        String name;
        String position;

        Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        void display() {
            System.out.println(name + " - " + position);
        }
    }
}

