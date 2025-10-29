import java.util.*;

public class Invoice {
    private Customer customer;
    private List<Product> productList = new ArrayList<>();

    public Invoice(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("==================================");
        System.out.println("      INVOICE BILLING SYSTEM");
        System.out.println("==================================");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product p : productList) {
            System.out.println(" - " + p);
        }
        System.out.println("----------------------------------");
        System.out.println("Total Amount: ₹" + calculateTotal());
        System.out.println("==================================");
    }
}
