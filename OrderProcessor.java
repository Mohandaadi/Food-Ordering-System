package foodOrderingSystem;

import java.util.LinkedList;
import java.util.Queue;

public class OrderProcessor {
	
	private Queue<Order> orderQueue;
	
	public OrderProcessor(){
		orderQueue = new LinkedList<>();
	}
	
	public void placeOrder(Order order) {
		orderQueue.offer(order);
		System.out.println("Order form " + order.getCustomerName() + " for " + order.getItemName() + " placed successfully.");
	}
	
	public void processOrder() {
		if(!orderQueue.isEmpty()) {
			Order order = orderQueue.poll();
			System.out.println("Processing order: " + order);
		}else {
			System.out.println("No orders to process.");
		}
	}
	
	public void displayOrders() {
		System.out.println("Current orders: " + orderQueue);
	}
}
