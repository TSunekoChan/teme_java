package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String orderID;
    private LocalDateTime date;
    private double totalPrice;
    private Product product;

    public Order(Product product, String orderID, LocalDateTime date, double totalPrice) {
        this.product = product;
        this.date = date;
        this.orderID = orderID;
        this.totalPrice = totalPrice;
    }

    public double TotalPrice(double price) {
        this.totalPrice += price;
        return this.totalPrice;
    }

    @Override
    public String toString() {
        return "Order is " + orderID + "at " + date + " white a total of " + totalPrice + " dolars";

    }
}
