package lesson4;


public class _5_ConstructorsAndOverloading {

    public static void main(String[] args) {

        System.out.println("---------- Login without credentials -------------");
        LoginUserPage loginPage = new LoginUserPage();

        System.out.println("---------- Login only with password -------------");
        loginPage = new LoginUserPage("password");

        System.out.println("---------- Login credentials -------------");
        loginPage = new LoginUserPage("user1", "password1");
    }
}


class LoginUserPage {
    public LoginUserPage(String userName, String password) {
        System.out.println("Login as '" + userName + "' / '"+ password + "'.");
    }

    public LoginUserPage(String password) {
        this("guest", password);
    }

    public LoginUserPage() {
        this("guestUser", "guestPassword");
    }
}
