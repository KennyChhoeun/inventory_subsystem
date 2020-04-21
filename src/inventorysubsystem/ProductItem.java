package inventorysubsystem;

import java.sql.*;
/**
 *
 * @author Kenny
 */
public class ProductItem implements ProductItemInterface {

    String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net/heroku_a191d5076c9f6e9";
    String username = "b22163d58326e0";
    // Going to remove password when pushing project to GitHub
    String pass = "";
    // I know this is a big security flaw, but its just a project ¯\_(ツ)_/¯
    
    @Override
    public void putItemOnSale(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAnItem(int productID, int amntAvail, String name, String backroomLocation, String salesFloorLocation, boolean onSale) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Get connection to database
            Connection myConnection = DriverManager.getConnection(url,username,pass);

            Statement statement = myConnection.createStatement();
            // create statement
            statement.executeUpdate("INSERT INTO Item"
                                    + " VALUES (" + productID + "," + "\"" + name + "\"" + "," +
                                    + amntAvail + ","  + "\"" + backroomLocation + "\"" + ","
                                    + "" + "\"" + salesFloorLocation + "\"" + ");");

            // Process the result set to print out to user
            System.out.println("Add successful");
        }catch(Exception e){System.out.println(e);}
    }

    @Override
    public void removeAnItem(int productID) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Get connection to database
            Connection myConnection = DriverManager.getConnection(url,username,pass);

            Statement statement = myConnection.createStatement();
            // create statement
            statement.executeUpdate("DELETE FROM Item " + "WHERE productID = " + productID + ";");

            // Process the result set to print out to user
            System.out.println("remove");
        }catch(Exception e){System.out.println(e);}
    }

    @Override
    public void defectAnItem(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void searchItem(int productID, String itemName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Get connection to database
            Connection myConnection = DriverManager.getConnection(url,username,pass);

            // create statement
            Statement addItemStmt = myConnection.createStatement();

            // Execute SQL query
            ResultSet myRs1 = addItemStmt.executeQuery("Select * from item where productID ="+productID);

            // Process the result set to print out to user
            while (myRs1.next()) {
                System.out.println("Search Results: " + myRs1.getString("productName"));
            }
        }catch(Exception e){System.out.println(e);}    
    }

    @Override
    public boolean isOnSale(int productID, String itemName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void restock(int amountRestocked) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkPrice(int productID, String itemName) {
        
    }

    @Override
    public void checkBackroomLocation(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkSalesFloorLocation(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putItemOnSale(double oldPrice, double newPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void relocateBackroomItem(int productID, String newBackLocation) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Get connection to db
            Connection myConnection = DriverManager.getConnection(url,username,pass);
            // create statement
            Statement statement = myConnection.createStatement();
            // Execute SQL query
            statement.executeUpdate("UPDATE item " +
                                    "SET backroomLocation = " + newBackLocation +
                                    "WHERE productID = " + productID);
        }catch(Exception e){System.out.println(e);}
    }

    @Override
    public void relocateSalesloorItem(int productID, String newSalesLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
