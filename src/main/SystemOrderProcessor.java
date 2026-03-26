package main;

public class SystemOrderProcessor implements OrderProcessor {
    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
