package inventorysubsystem;

public class sqlCreds {
    // added to git ignore will not be shared publicly
    private static String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net/heroku_a191d5076c9f6e9";
    private static String sql_username = "b22163d58326e0";
    // removed password 
    private static String pass = "";
    
    public String getUrl(){
        return url;
    }
    
    public String getUsername(){
        return sql_username;
    }
    
    public String getPass(){
        return pass;
    }
}
