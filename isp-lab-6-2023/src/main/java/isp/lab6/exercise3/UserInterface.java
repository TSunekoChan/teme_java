package isp.lab6.exercise3;

import java.util.Scanner;

public interface UserInterface {
    LoginSystem logsys = null;
    OnlineStore store = null;

    public static void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Online Store please choose one of the options:");
            System.out.println("1.Register");
            System.out.println("2.Login");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter username");
                    String username = scanner.next();
                    System.out.println("enter password that has at least one special character , one uper character , one lower character and one number");
                    String password = scanner.next();
                    logsys.register(username, password);
                    break;
                case 2:
                    System.out.println("enter username");
                    username = scanner.next();
                    System.out.println("enter passsword");
                    password = scanner.next();
                    logsys.login(username, password);
                    store.getSessions();
                    System.out.println("1.add to cart");
                    System.out.println("2.checkout");
                    System.out.println("3.logout");
                    System.out.println("0.exit program");
                    int options = scanner.nextInt();
                    switch (options) {
                        case 1:
                            System.out.println("product and quantity");
                            String product_name = scanner.next();
                            Product product = new Product(product_name);
                            int qouantity = scanner.nextInt();
                            store.addToCart(username, product, qouantity);
                            break;
                        case 2:
                            store.checkout(username);
                            break;
                        case 3:
                            System.out.println("enter your username");
                            username = scanner.next();
                            System.out.println("enter password");
                            password = scanner.next();
                            logsys.logout(username, password);
                            break;
                        case 4:
                            System.out.println("exit program");
                            System.exit(0);
                        default:
                            System.out.println("invalid option. Please choose again");
                            break;
                    }
                    break;
                default:
                    System.out.println("invalid option.Please choose again.");
                    break;


            }
        }

    }
}
