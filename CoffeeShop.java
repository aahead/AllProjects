public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder coffee1 = new CoffeeOrder();
        CoffeeOrder coffee2 = new CoffeeOrder("small");
        CoffeeOrder coffee3 = new CoffeeOrder("large", "cappuccino");

        // TODO 3: Call describeOrder() on each and print the result
        coffee1.describeOrder();
        coffee2.describeOrder();
        coffee3.describeOrder();
        // TODO 4: Print the total number of orders using
        // CoffeeOrder.getTotalOrders()
        System.out.println(CoffeeOrder.getTotalOrders());
    }
}
