package lesson6.Practice;

public class Administrator extends User {

    @Override
    public void login(String userName, String userPass) {
        //Add code here.
        System.out.println("Role: administrator.");
    }
}
