package inventorysubsystem;

public class Run {
    public static void main(String[] args) {
        try {
            LoginMenu frame = new LoginMenu();
            frame.setTitle("Login");
            frame.setVisible(true);
            }catch (Exception e) {
                e.printStackTrace();
            }
    }
}