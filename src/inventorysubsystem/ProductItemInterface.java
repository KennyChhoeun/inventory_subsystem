package inventorysubsystem;

/**
 *
 * @author inventory subsystem team
 */
public interface ProductItemInterface extends ItemInterface {
    public void putItemOnSale(int productID, double discountPercent, String startDate, String endDate);
}
