package inventorysubsystem;
import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        ProductItem itemTest = new ProductItem();
        /*System.out.print("Input the productID to search: ");
        Scanner input = new Scanner(System.in);
        int productID_input = input.nextInt();
        itemTest.searchItem(productID_input,"Nike");*/

        itemTest.relocateBackroomItem(2, "C9");
        //itemTest.addAnItem(3,20,"Random item", "C34", "Women's Clothing", false );
        // I know we need a GUI but i just wanted to test out the connection to the database.
    }
}