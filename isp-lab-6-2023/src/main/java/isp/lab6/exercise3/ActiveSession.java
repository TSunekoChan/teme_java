package isp.lab6.exercise3;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class ActiveSession {
    private String username;
    private Map shoppingcart;
    ActiveSession(String username){
        this.username=username;
    }

    public void addToCart(Product product, int quantity) {
         shoppingcart.put(product,quantity);
        System.out.println("product :" + product + " quantity: " + quantity);
    }
}
