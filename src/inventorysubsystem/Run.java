package inventorysubsystem;
import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        Item itemTest = new Item();
        /*System.out.print("Input the productID to search: ");
        Scanner input = new Scanner(System.in);
        int productID_input = input.nextInt();
        itemTest.searchItem(productID_input,"Nike");*/

        itemTest.removeAnItem(3);

        //itemTest.addAnItem(3,20,"Random item", "C34", "Women's Clothing", false );
        // I know we need a GUI but i just wanted to test out the connection to the database.
    }
}