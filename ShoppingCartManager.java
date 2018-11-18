
import java.util.Scanner;

public class ShoppingCartManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Customer's Name:");
		String customerName = input.nextLine();
		System.out.println("Enter Today's Date:");
		String date = input.nextLine();
		
		ShoppingCart cart1 = new ShoppingCart(customerName, date);
		System.out.println();
		System.out.println("Customer Name: " + customerName);
		System.out.println("Today's Date: " + date);
		System.out.println();
		//create menu
		String selection;
		do {
			printMenu();
			selection = input.nextLine();
			switch(selection) {
			default:
				while(!selection.equals("q")) {
					System.out.println("Choose an option:");
					selection = input.nextLine();
				}
			case "q":
				break;
			case "a":
				System.out.println("ADD ITEM TO CART");
				System.out.println("Enter the item name:");
				String addName = input.nextLine();
				System.out.println("Enter the item description:");
				String itemDescritpion = input.nextLine();

				System.out.println("Enter the item price:");
				int itemPrice = input.nextInt();

				System.out.println("Enter the item quantity:");

				int quantity = input.nextInt();
				
				input.nextLine();

				ItemToPurchase item = new ItemToPurchase(addName, itemDescritpion, itemPrice, quantity);
				cart1.addItem(item);
				System.out.println();
				break;
				
			case "d":
				System.out.println("REMOVE ITEM FROM CART");
				System.out.println("Enter name of item to remove:");
				String removeName = input.nextLine();
				cart1.removeItems(removeName);
				System.out.println();
				break;
				
			case "c":
				System.out.println("CHANGE ITEM QUANTITY");
				System.out.println("Enter the item name:");
				String modifyName = input.nextLine();
				System.out.println("Enter the new quantity:");
				int modifyQuantity = input.nextInt();
				ItemToPurchase itemToModify = new ItemToPurchase(modifyName, "none", 0, modifyQuantity);
				input.nextLine();
				cart1.modifyItem(itemToModify);
				System.out.println();
				break;
				
			case "i":
				System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
				System.out.println(customerName+ "'s Shopping Cart - " + date);
				System.out.println();
				cart1.printDescriptions();
				System.out.println();
				break;
				
			case "o":
				System.out.println("OUTPUT SHOPPING CART");
				System.out.println(customerName+ "'s Shopping Cart - " + date);
				cart1.printTotal();
				System.out.println();
				break;
			
			}
		} while(!selection.equals("q"));
	}
	
	public static void printMenu() {
		System.out.println("MENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("q - Quit");
		System.out.println();
		System.out.println("Choose an option:");
	}
}
