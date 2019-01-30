package lesson4;


public class _2_MethodAndParameters {

    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        loginPage.login("User1", "Password1");
    }
}

class LoginPage {
    // State or instance variables
    private boolean isUserLoggedIn;


    // Behaviour or methods
    public void login(String userName, String password){
        // some login, password implementation
        this.isUserLoggedIn = true;
        System.out.println("We successfully is logged in.");
    }

    public boolean isUserLoggedIn() {
        return this.isUserLoggedIn;
    }
}
