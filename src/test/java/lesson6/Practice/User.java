package test.java.lesson6.Practice;

public class User {
public static int numberoflogins;
    // Add one instance variable.

    public void login(String userName, String userPass) {
        System.out.print("Login as: " + userName + ", " + userPass + ". ");
    }
    public void logout() {
        // Add code here.
    }
    public int getNumberOfLogins() {
        return numberoflogins;
    }
}
