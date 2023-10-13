package isp.lab4.exercise1;

public class Product {
    private static String productId;
    private static String name;
    private static double price;
    private ProductCategory productCategory;
    private Customer costumer;

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setCostumer(Customer costumer) {
        this.costumer = costumer;
    }

    public static void setProductId(String productId) {
        Product.productId = productId;
    }

    public static void setName(String name) {
        Product.name = name;
    }

    public static void setPrice(double price) {
        Product.price = price;
    }

    public Customer getCostumer() {
        return costumer;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    @Override
    public String toString() {
        return "product ID is " + productId + "name :" + name + "price " + price + " from the category" + productCategory;

    }

}
