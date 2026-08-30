public class Product {
    private String code; private String name; private double unitPrice; private int quantity; private static int productCount;
    public Product(String code, String name, double unitPrice) { this(code, name, unitPrice, 0); }
    public Product(String code, String name, double unitPrice, int quantity) {
        if (unitPrice <= 0 || quantity < 0) throw new IllegalArgumentException("Invalid price or quantity");
        this.code = code; this.name = name; this.unitPrice = unitPrice; this.quantity = quantity; productCount++;
    }
    public boolean restock(int amount) { if (amount <= 0) return false; quantity += amount; return true; }
    public boolean sell(int amount) { if (amount <= 0 || amount > quantity) return false; quantity -= amount; return true; }
    public double getInventoryValue() { return unitPrice * quantity; }
    public static int getProductCount() { return productCount; }
    public String toString() { return "Product{code='" + code + "', name='" + name + "', price=" + unitPrice + ", quantity=" + quantity + ", value=" + getInventoryValue() + "}"; }
}
