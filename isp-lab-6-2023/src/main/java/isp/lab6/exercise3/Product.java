package isp.lab6.exercise3;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    Product(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object product) {
        return super.equals(product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
