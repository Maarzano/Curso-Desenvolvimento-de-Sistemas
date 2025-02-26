package maarzano.programadeentrega.Models;

import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private Map<String, Order> orders = new HashMap<>();

    public OrderService() {
        orders.put("1", new Order("1", OrderStatus.PENDING));
        orders.put("2", new Order("2", OrderStatus.PROCESSING));
        orders.put("3", new Order("3", OrderStatus.SHIPPED));
        orders.put("4", new Order("4", OrderStatus.DELIVERED));
        orders.put("0", new Order("0", OrderStatus.STOLLED));
        orders.put("5", new Order("5", OrderStatus.TAXED));
    }

    public Order findOrderById(String id) {
        return orders.get(id);
    }
}