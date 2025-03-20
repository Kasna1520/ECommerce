import java.util.ArrayList;
class Product {
    String name;
    double price;
    int quantity;
    
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void display() {
        System.out.println(name + " - Price: " + price + " Quantity: " + quantity);
    }
}
public class RetailStore {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 2.5, 50));
        products.add(new Product("Tomato", 1.2, 100));
        products.add(new Product("Rice", 3.0, 30));
        
        System.out.println("Available Products:");
        for (Product p : products) {
            p.display();
        }
    }
}
