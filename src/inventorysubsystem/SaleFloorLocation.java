package inventorysubsystem;


public class SaleFloorLocation {
    private int salesfloorlocationid;
    private int productid;
    private int currentQuantity;
    
    public SaleFloorLocation (int saleid, int productid, int currentQuantity)
    {
        this.salesfloorlocationid = saleid;
        this.productid = productid;
        this.currentQuantity = currentQuantity;
    }
    
    // getter methods
    public int getSaleID()
    {
        return salesfloorlocationid;
    }
    
    public int getProductID()
    {
        return productid;
    }
    public int getCurrentQuantity()
    {
        return currentQuantity;
    }
}
