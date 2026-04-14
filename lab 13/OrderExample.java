import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrderExample {
        public static void main(String[] args) {

                List<order> orders = Arrays.asList(
                        new order("Apple", 3, 100),
                        new order("Banana", 2, 50),
                        new order("Orange", 5, 80)
                );

                // 1. Барлық тапсырыстардың жалпы сомасы
                double totalSum = orders.stream()
                        .map(order::getTotal)
                        .reduce(0.0, Double::sum);

                System.out.println(STR."Жалпы сумма: \{totalSum}");

                // 2. 100-ден көп сомасы бар тапсырыстар
                List<order> filteredOrders = orders.stream()
                        .filter(o -> o.getTotal() > 100)
                        .toList();

                System.out.println(STR."100-ден көп тапсырыстар: \{filteredOrders}");

                // 3. Орташа мән
                double average = orders.stream()
                        .mapToDouble(order::getTotal)
                        .average()
                        .orElse(0.0);

                System.out.println(STR."Орташа сумма: \{average}");

                // 4. Ең қымбат тапсырыс
                order maxOrder = orders.stream()
                        .max(Comparator.comparing(order::getTotal))
                        .orElse(null);

                System.out.println(STR."Ең қымбат тапсырыс: \{maxOrder}");
        }
}
