package test.java.lesson6.Practice;

public class Guest extends User {

    @Override
    public void login(String userName, String userPass) {
        numberoflogins++;
        System.out.print("Login as: "+userName+" , "+userPass+".  ");
    System.out.println("Role: guest.");
    }
    public void login(String userName) {

        if (userName.equals("guest")) {
            System.out.print("Login as: "+userName+".  ");
            numberoflogins++;
            System.out.println("Role: guest.");
        }
        else{
            System.out.println("Wrong default login name");
        }
    }
}
