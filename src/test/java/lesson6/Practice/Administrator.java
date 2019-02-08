 package test.java.lesson6.Practice;

public class Administrator extends User {

    @Override
    public void login(String userName, String userPass) {
        numberoflogins++;
        System.out.print("Login as: "+userName+" , "+userPass+".  ");
        System.out.println("Role: administrator.");
    }
}
