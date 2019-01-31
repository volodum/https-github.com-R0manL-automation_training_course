package lesson6.Practice;

public class Guest extends User {

    @Override
    public void login(String userName, String userPass) {
        // Add code here.
        System.out.println("Role: guest.");
    }

    public void login(String userName) {
        // Add code here that check if userName equals "guest" then login with guest/guest credentials,
        // else - print "Wrong default login name" message.
    }
}
