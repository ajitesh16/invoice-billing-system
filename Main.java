import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Invoice Billing Management System =====");
        System.out.print("Enter Customer ID: ");
        int cid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String cname = sc.nextLine();

        Customer customer = new Customer(cid, cname);
        Invoice invoice = new Invoice(customer);

        while (true) {
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            String pname = sc.nextLine();
            System.out.print("Enter Product Price: ₹");
            double price = sc.nextDouble();

            Product product = new Product(pid, pname, price);
            invoice.addProduct(product);

            System.out.print("Add another product? (y/n): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("n")) break;
        }

        invoice.printInvoice();
        sc.close();
    }
}
