// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
class Product{
    // - A protected String field called name
    protected String name;
    // - A protected double field called price
    protected double price;
    // - A private final int productId
    private final int productId;
    // - A public static int nextId to help generate unique IDs
    public static int nextId = 0;
    // - A constructor that sets name, price, and assigns a unique ID
    
    
    // The constructor is public to make sure there are no issues with using it in different areas.
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.productId = nextId++;
        
    }
    // - Public getters for all fields
    public String getName(){
        return "Name is: " + name;
    }
    public String getPrice(){
        return "Price is: " + price;
    }
    public String getProductId(){
        return "Product ID is: " + productId;
    }
    public String getNextId(){
        return "Next ID is: " + nextId;
    }
    // - Override toString() to return formatted product details
    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nProduct ID: " + productId + "\nNext ID: " + nextId;
    }
    // - Override equals(Object o) to compare name and productId
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(!(o instanceof Product)) return false; 
        
        return (((Product) o).name.equals(this.name)) && (((Product) o).productId == (this.productId));
    }
}


// TODO: Define a subclass Electronics that extends Product
class Electronics extends Product{
    // - Add a private String field called brand
    private String brand;
    // - Add a private boolean field called hasBattery
    private boolean hasBattery;
    // - Constructor takes all fields and uses super for shared ones

    // This is a public contstructor for the same reason as product, it is meant to be easier to use all over the program.
    public Electronics(String name, double price, String brand, boolean hasBattery){
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }
    // - Override toString() to include brand and battery status
    @Override
    public String toString() {
        return "Brand: " + brand + "\nBattery: " + hasBattery;
    }

    // This is from one of the extra TODO's.
    final void warrantyInfo(){
        System.out.println("You don't get a warranty :)");
    }
}


// TODO: Define a subclass Grocery that extends Product
class Grocery extends Product{
    // - Add a private double field called weight (in kg)
    private double weight;
    // - Add a private boolean field called isPerishable
    private boolean isPerishable;
    // - Constructor takes all fields and uses super for shared ones

    // Again this is public just to make sure that it is easy to call and use throughout the program.
    public Grocery(String name, double price, double weight, boolean isPerishable){
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }
    // - Override toString() to include weight and perishability
    @Override
    public String toString() {
        return "Weight: " + weight + "kg\nPerishable: " + isPerishable;
    }
}


// TODO: Define a final class Toy that extends Product
final class Toy extends Product{
    // - Add a private int field called minAge
    private int minAge;
    // - Constructor takes all fields and uses super for shared ones

    // This is public to make sure that it is easy to use in the main class.
    public Toy(String name, double price, int minAge){
        super(name, price);
        this.minAge = minAge;
    }
    // - Override toString() to include minAge
    @Override
    public String toString() {
        return "Minimum Age: " + minAge;
    }
}

class Coupon extends Electronics{
    final double discountRate = 0.10;

    // This is public to ensure no problems with access.
    public Coupon(String name, double price, String brand, boolean hasBattery){
        super(name, price, brand, hasBattery);
    }

    // This public for the same reason, however this method is to apply the discounted rate to the price of an electronic.
    public void applyCoupon(double price){
        System.out.println("Original Price: " + price + "\nDiscounted Price: " + (price - (price * discountRate)));
    }
}

// TODO: Define class SuperStoreTest with a main method
public class SuperStoreTest{
    public static void main(String[] args) {
        // - Create at least one instance of each subclass
        Electronics electro = new Electronics("Iphone", 1000, "Apple", true);
        Grocery grocery = new Grocery("Apple Jacks", 10, 1, true);
        Toy toy = new Toy("GameBoy", 150, 10);
        // - Store them in a Product[] array
        Product[] products = new Product[3];
        // - Loop through and print each item
        products[0] = electro;
        products[1] = grocery;
        products[2] = toy;

        for (int i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }
        // - Call equals() to compare two products with the same ID and name 
        System.out.println("Is an Iphone an Iphone: " + electro.equals(electro));
    }
}


// Additional TODOs:
// 1. Try to extend Toy — what happens and why? | DONE

// You cannot extend Toy because it is a final class, meaning it cannot be extended.

// 2. Make a class Coupon with a final discountRate and apply it to a Product | DONE

// 3. Add a method to Electronics called warrantyInfo() and mark it final | DONE
// 4. Use access modifiers appropriately and explain your choices in comments | DONE
