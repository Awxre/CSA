public class ItemSold {
    private int invoiceNumber;
    private String description;
    private double price;

    public ItemSold() {
        invoiceNumber = 0;
        description = "";
        price = 0;
    }

    // Getters
    int getInvoiceNumber() {
        return invoiceNumber;
    }
    String getDescription() {
        return description;
    }
    double getPrice() {
        return price;
    }

    // Setters
    void setInvoiceNumber(int x) {
        invoiceNumber = x;
    }
    void setDescription(String x) {
        description = x;
    }
    void setPrice(double dollars) {
        price = dollars;
    }
}
