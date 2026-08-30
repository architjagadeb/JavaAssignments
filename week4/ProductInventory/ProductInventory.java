public class ProductInventory {
    public static void main(String[] args) {
        Product first = new Product("P101", "Notebook", 50);
        Product second = new Product("P102", "Pen", 10, 20);
        Product third = new Product("P103", "Bag", 800, 5);
        first.restock(10);
        second.sell(4);
        System.out.println(third.sell(10));
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println("Total products: " + Product.getProductCount());
    }
}
