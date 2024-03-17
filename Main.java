package foodOrderingSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderProcessor orderProcessor = new OrderProcessor();

        // Placing orders
        orderProcessor.placeOrder(new Order("Alice", "Burger"));
        orderProcessor.placeOrder(new Order("Bob", "Pizza"));
        orderProcessor.placeOrder(new Order("Charlie", "Fries"));

        // Displaying current orders
        orderProcessor.displayOrders();

        // Processing orders
        orderProcessor.processOrder();
        orderProcessor.processOrder();

        // Displaying updated orders
        orderProcessor.displayOrders();
	}

}
