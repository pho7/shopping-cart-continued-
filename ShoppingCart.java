
import java.util.ArrayList;
public class ShoppingCart {
	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems = new ArrayList<>(); 
	
	//constructor
	public ShoppingCart() {
		customerName = "none";
		currentDate = "January 1, 2016";
	}
	
	public ShoppingCart(String customerName, String currentDate) {
		this.customerName = customerName;
		this.currentDate = currentDate;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public String getDate() {
		return currentDate;
	}
	
	public void addItem( ItemToPurchase item) {
		cartItems.add(item);
	}
	
	public void removeItems(String itemName) {
		boolean search = true;
		if(search) {
			for (int i = 0; i < cartItems.size(); i++)
	        {
				ItemToPurchase item = cartItems.get(i);
	            if ((item.getName()).equals(itemName)) {
	                cartItems.remove(i);
	                search = false;
	            } 
	        }
		}
		if (search == true) {
			System.out.println("Item not found in cart. Nothing removed.");
		}
	}
	public void modifyItem(ItemToPurchase itemToModify) {
		boolean search = true;
		if(search) {
	        for (int i = 0; i < cartItems.size(); i++) {
	            ItemToPurchase item = cartItems.get(i);
	            if ((itemToModify.getName()).equals(item.getName())) {
	            	search = false;
	            	if (!itemToModify.getDescription().equals("none")) {
	            		item.setDescription(itemToModify.getDescription());
	            	}
	            	if (itemToModify.getPrice() != 0) {
	            		item.setPrice(itemToModify.getPrice());
	            	}
	            	if (itemToModify.getQuantity() != 0) {
	            		item.setQuantity(itemToModify.getQuantity());
	            	}
	            } 
	            
	        }
		}
		if(search == true)
            System.out.println("Item not found in cart. Nothing modified.");
    }
	public int getNumItemsInCart() {
		int totalQuantity = 0;
		for (ItemToPurchase item : cartItems) {
			totalQuantity += item.getQuantity();
		}
		return totalQuantity;
	}
	
	public int getCostOfCart() {
		int totalCost = 0;
		for(ItemToPurchase items: cartItems) {
			totalCost += (items.getPrice() * items.getQuantity());
		}
		return totalCost;
	}
	public void printTotal() {
		int itemCount = cartItems.size();
		System.out.println("Number of Items: " + this.getNumItemsInCart());
		System.out.println();
			if  (itemCount != 0) {
				for (ItemToPurchase item : cartItems) {
					System.out.println(item.printItemCost());
				}
		}  
		else {
			System.out.println("SHOPPING CART IS EMPTY");
		}
			System.out.println();
			System.out.println("Total: $" + getCostOfCart());
	}
	
	public void printDescriptions() {
		System.out.println("Item Descriptions");
		for (ItemToPurchase item : cartItems) {
			System.out.println(item.printItemDescription());
		}
	}
}
