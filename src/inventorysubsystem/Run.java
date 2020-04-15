package inventorysubsystem;
import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        Item itemTest = new Item();
        System.out.println("Input the productID to search: ");
        Scanner input = new Scanner(System.in);
        int productID_input = input.nextInt();
        itemTest.searchItem(productID_input,"Nike");
        // I know we need a GUI but i just wanted to test out the connection to the database.
    }
}