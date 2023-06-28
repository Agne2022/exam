import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class AccountRegistrationTest extends BaseTest {

    @Test
    public void positiveTest () {
        AccountRegistrationPage registration = new AccountRegistrationPage(driver);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100000);
        String userName = "Agne" + randomInt;
        String password = "labas";
        registration.setInputUsernameField(userName);
        registration.setInputPasswordField(password);
        registration.setInputPasswordConfirmField(password);
        registration.clickInputCreate();

        // Logout
        HomePage homePage = new HomePage(driver);
        homePage.clickLogout();

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setInputUsernameField(userName);
        loginPage.setInputPasswordField(password);
        loginPage.clickLoginButton();
        Assertions.assertEquals("Logout, " + userName, homePage.getLogoutText(), "Wrong user logged in");
    }
}