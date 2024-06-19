import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Order  {
    private String product;
    private double cost;



    public Order(String product, double cost) {
            this.product = product;
            this.cost = cost;
        }
        public String getProduct() {
            return product;
        }
        public double getCost() {
            return cost;
        }
    }

