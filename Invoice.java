public class Invoice {
    private static int billCounter = 1000; // starting bill number
    private int billNumber;
    private Customer customer;
    private Product[] products;
    private int productCount;
    private double totalAmount;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.products = new Product[10];
        this.productCount = 0;
        this.billNumber = ++billCounter; // Auto-increment each new invoice
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
            totalAmount += product.getPrice();
        }
    }

    public void displayInvoice() {
        System.out.println("==========================================");
        System.out.println("              INVOICE BILL");
        System.out.println("==========================================");
        System.out.println("Bill No: " + billNumber);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("------------------------------------------");
        System.out.println("Product ID\tProduct Name\tPrice");
        System.out.println("------------------------------------------");

        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].getId() + "\t\t" + products[i].getName() + "\t\t" + products[i].getPrice());
        }

        System.out.println("------------------------------------------");
        System.out.println("Total Amount: ₹" + totalAmount);
        System.out.println("==========================================");
    }
}
