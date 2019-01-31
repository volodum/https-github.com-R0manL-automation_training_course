package lesson4;


public class _3_SetterAndGetter {

    public static void main(String[] args) {

        LoginPageImpl loginPage = new LoginPageImpl();
        loginPage.setLogin("User1");
        loginPage.setPassword("Password1");

        System.out.println("We enter '" + loginPage.getEnteredUserName() + "' user name,");
        System.out.println("We enter '" + loginPage.getEnteredPassword() + "' password.");
    }
}

class LoginPageImpl {
    // State or instance variables
    private String userName;
    private String password;


    // Behaviour or methods
    public void setLogin(String userName) {
        this.userName = userName;
        System.out.println("User name set to '" + userName + "'.");
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password set to '" + password + "'.");
    }

    public String getEnteredUserName() {
        return this.userName;
    }

    public String getEnteredPassword() {
        return this.password;
    }
}

