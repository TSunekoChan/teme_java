package isp.lab4.exercise1;
import java.time.LocalDateTime;
public class Exercise1 {

    public static void main(String[] args) {
        // Address
        Address address = new Address();
        address.setCity("Cluj Napoca");
        address.setStreet("21 Decembrie");

        //  Customer
        Customer customer = new Customer();
        customer.setCostumerID("1123");
        customer.setName("Peter Pann");
        customer.setPhone("072 n-am cartela");
        customer.setAdress(address);

        //  Product
        Product product = new Product();
        Product.setProductId("S23");
        Product.setName("Smartphone");
        Product.setPrice(1500.0);
        product.setProductCategory(ProductCategory.ELECTRONICS);
        product.setCostumer(customer);

        //  Order
        LocalDateTime date = LocalDateTime.now();
        Order order = new Order(product, "671b ", date, 500.0);

        // Print the order
        System.out.println(order);
    }
}
