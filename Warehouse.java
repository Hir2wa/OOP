public class Warehouse {
    // Attributes
    private String warehouseName;
    private String location;
    private double stock; // current stock in kg
    private final double maxCapacity = 1000.0; // Maximum capacity in kg
    private final double minAllowedStock = 0.0; // Minimum allowed stock

    // Constructor
    public Warehouse(String warehouseName, String location) {
        this.warehouseName = warehouseName;
        this.location = location;
        this.stock = 0; // Initial stock is set to 0 kg
    }

    // Method to add stock
    public void addStock(double amount) {
        if (amount < 0) {
            System.out.println("Invalid input: Cannot add negative stock.");
        } else if (stock + amount > maxCapacity) {
            System.out.println("Cannot add stock. Exceeds maximum capacity of " + maxCapacity + "kg.");
        } else {
            stock += amount;
            System.out.println(amount + "kg added. New stock: " + stock + "kg.");
        }
    }

    // Method to withdraw stock
    public void withdrawStock(double amount) {
        if (amount < 0) {
            System.out.println("Invalid input: Cannot withdraw negative stock.");
        } else if (amount > stock) {
            System.out.println("Insufficient stock. You only have " + stock + "kg available.");
        } else {
            stock -= amount;
            System.out.println(amount + "kg withdrawn. Remaining stock: " + stock + "kg.");
        }
    }

    // Method to print stock details
    public void printStockDetails() {
        System.out.println("Warehouse: " + warehouseName);
        System.out.println("Location: " + location);
        System.out.println("Current Stock: " + stock + "kg");
        System.out.println("Maximum Capacity: " + maxCapacity + "kg");
        System.out.println("Minimum Allowed Stock: " + minAllowedStock + "kg");
    }

    // Getters and setters (optional, for further access to attributes if needed)
    public String getWarehouseName() {
        return warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public double getStock() {
        return stock;
    }
}
