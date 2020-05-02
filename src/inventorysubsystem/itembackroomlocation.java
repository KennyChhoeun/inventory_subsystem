package inventorysubsystem;

public class itembackroomlocation {
    private int productID;
    private String productLocation;
    
    public itembackroomlocation(int productID, String productLocation)
    {
        this.productID = productID;
        this.productLocation = productLocation;
    }
    
    // getters
    public int getProductID()
    {
        return productID;
    }
    
    public String getProductLocation()
    {
        return productLocation;
    }
}
