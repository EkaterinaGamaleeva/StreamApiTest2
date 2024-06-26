import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );

        Map<String, Double> map = orders
                .stream()
                .collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getCost)));
        System.out.println(
                Stream.of(map)
                        .collect(Collectors.toMap
                                (e -> e.keySet().stream().sorted(Comparator.comparingDouble(s -> map.get(s)).reversed()).toList()
                                        , e -> e.values().stream().sorted(Comparator.reverseOrder())
                                                .toList())
                        )
        );
    }
}
