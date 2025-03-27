public class CoffeeOrder {
    String size;
    String type;
    private String orderID;

    static int totalOrders = 0;

    // TODO 4: Create a no-arg constructor
    // Set size to "medium" and type to "black"
    // Increment totalOrder
    CoffeeOrder(){
        this.size = "medium";
        this.type = "black";
        totalOrders++;
    }

    // TODO 5: Create a constructor that takes a size only
    // Set type to "black" by default
    // Increment totalOrders
    CoffeeOrder(String size){
        this.size = size;
        this.type = "black";
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type
    // Increment totalOrders
    CoffeeOrder(String size, String type){
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns
    // something like "Order: medium black"
    void describeOrder(){
        System.out.println("Order: " + this.size + " " + this.type);
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    static int getTotalOrders(){
        return totalOrders;
    }
}
