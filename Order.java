package foodOrderingSystem;

public class Order {
	
	private String customerName;
	private String itemName;
	
	public Order(String customerName, String itemName) {
		this.customerName = customerName;
		this.itemName = itemName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	@Override
	public String toString() {
		return "Order{" +
                "customerName='" + customerName + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
	}
}
