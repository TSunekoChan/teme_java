package isp.lab6.exercise3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class OnlineStore {
    private List<Product> products;
    private Map<String, ActiveSession> sessions;

    public List<Product> getProducts() {
        return products;
    }

    public Map<String, ActiveSession> getSessions() {
        return sessions;
    }

    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        List<Product> sortedProducts = new ArrayList<>(this.products);
        sortedProducts.sort(sortCriteria);
        return sortedProducts;
    }


    private void addSession(String username) {
        if (!sessions.containsKey(username)) {
            sessions.put(username, new ActiveSession(username));
            System.out.println(username + " added to session");
        } else {
            System.out.println(username + " is already in a session");
        }
    }

    private void removeSession(String username) {
        if (sessions.remove(username) != null) {
            System.out.println("user " + username + " removed from session");
        } else {
            System.out.println("user not found");
        }
    }

    public void addToCart(String username, Product product, int qoantity) {
        if (!sessions.containsValue(username)) {
            ActiveSession session = new ActiveSession(username);
            session.addToCart(product, qoantity);
            System.out.println("product added.");
        } else System.out.println("user does not exist.");
    }

    public String checkout(String username){
        return "The checkout is " + sessions.containsValue(username) ;
    }

}
