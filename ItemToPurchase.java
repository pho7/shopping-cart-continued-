
/**
 * Holds data for items.
 */
public class ItemToPurchase
{
    // Private variables
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    
    private String itemDescription;

    /**
     * The default constructor
     */
    public ItemToPurchase()
    {
    	itemDescription	= "none";
        itemName     = "none";
        itemPrice    = 0;
        itemQuantity = 0;
    }
    
    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getDescription() {
		return itemDescription;
	}


	public void setDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public void setName(String nameOfItem)
    {
        itemName = nameOfItem;
    }

    public String getName()
    {
        return itemName;
    }

    public void setPrice(int priceOfItem)
    {
        itemPrice = priceOfItem;
    }

    public int getPrice()
    {
        return itemPrice;
    }

    public void setQuantity(int quantityOfItem)
    {
        itemQuantity = quantityOfItem;
    }

    public int getQuantity()
    {
        return itemQuantity;
    }
    
    public String printItemCost() {
    	return String.format("%s %d @ $%d = $%d",
                this.getName(),
                this.getQuantity(),
                this.getPrice(),
                this.getPrice() * this.getQuantity()
        );
    }
    
    public String printItemDescription() {
    	return String.format("%s: %s", this.getName(), this.getDescription());
    }
}