package inventorysubsystem;

/**
 *
 * @author inventory subsystem team
 */
public interface ItemInterface {
    public void addAnItem(int productID, int amntAvail, String name, String backroomLocation, String salesFloorLocation, boolean onSale);
    public void removeAnItem(int productID);
    public void defectAnItem(int productID);
    public void putItemOnSale(double oldPrice, double newPrice);
    public void searchItem(int productID, String itemName);
    public boolean isOnSale(int productID, String itemName);
    public void relocateBackroomItem(int productID, String newBackLocation);
    public void relocateSalesloorItem(int productID, String newSalesLocation);
    public void restock(int amountRestocked);
    public void checkPrice(int productID, String itemName);
    public void checkBackroomLocation(int productID);
    public void checkSalesFloorLocation(int productID);
}