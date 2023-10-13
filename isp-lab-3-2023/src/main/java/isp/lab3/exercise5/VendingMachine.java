package isp.lab3.exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private int[] id;
    private String[] product;
    private int[] value;
    private int credit;

    public int[] getId() {
        return id;
    }

    public int[] getValue() {
        return value;
    }

    public String[] getProduct() {
        return product;
    }

    public void setMenu(int id, String product, int value, int credit) {
        this.credit = credit;
        this.id = new int[]{id};
        this.product = new String[]{product};
        this.value = new int[]{value};
    }

    public void displayProducts() {
        System.out.println("Available products:");
        for (int i = 1; i <= getId().length; i++) {
            System.out.println(getProduct());
            System.out.println(id[i]);
        }
    }

    public void insertCoin(int credit) {
        this.credit += credit;
        System.out.println("curent credit is :" + this.credit);
    }

    public String[] selectProduct(int[] id) {
        String product = product.get(id);
        if (product == null) {
            return new String[]{" not availble "};
        }
        if (credit <= 1) {
            return new String[]{" insuficient credit"};
        } else {
            this.credit -= this.value;
            return new String[]{product};
        }

    }

    public void displayCredit() {
        System.out.println("Current credit: $" + credit);
    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the vending machine. Please select an option:");
            System.out.println("1. View products");
            System.out.println("2. Insert coins");
            System.out.println("3. Select a product");
            System.out.println("4. Display credit");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.println("Enter the amount of coins to insert:");
                    int value = scanner.nextInt();
                    insertCoin(value);
                    break;
                case 3:
                    System.out.println("Enter the ID of the product to select:");
                    int id = scanner.nextInt();
                    String message = selectProduct(id);
                    System.out.println(message);
                    break;
                case 4:
                    displayCredit();
                    break;
                case 5:
                    System.out.println("Thank you for using the vending machine.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
