import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
        public static void main(String[] args) {
                // Тізімдер тізімі
                List<List<String>> listOfLists = Arrays.asList(
                        Arrays.asList("A", "B"),
                        Arrays.asList("C", "D"),
                        Arrays.asList("E", "F")
                );

                // flatMap арқылы бір тізімге біріктіру
                List<String> result = listOfLists.stream()
                        .flatMap(list -> list.stream())
                        .collect(Collectors.toList());

                System.out.println("FlatMap нәтижесі: " + result);
        }
}


class order {
        String product;
        int quantity;
        double price;

        public order(String product, int quantity, double price) {
                this.product = product;
                this.quantity = quantity;
                this.price = price;
        }

        // Тапсырыс сомасы
        public double getTotal() {
                return quantity * price;
        }

        @Override
        public String toString() {
                return STR."\{product} x\{quantity} = \{getTotal()}";
        }
}

