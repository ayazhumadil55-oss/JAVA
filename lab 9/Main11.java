class Car {
    class Engine {
        int power;

        Engine(int power) {
            this.power = power;
        }

        void show() {
            System.out.println("Engine power: " + power + " HP");
        }
    }
}

public class Main11 {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine(150);
        engine.show();
    }
}

class Bank {
    static double interestRate = 0.1;

    static double calculateInterest(double amount) {
        return amount * interestRate;
    }
}

