import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage {

    @FindBy(css = "input[name='username']")
    private WebElement inputUsernameField;

    @FindBy(css = "input[name='password']")
    private WebElement inputPasswordField;

    @FindBy(xpath =" /html//form[@action='/prisijungti']//button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setInputUsernameField(String inputUsernameField) {
        this.inputUsernameField.sendKeys(inputUsernameField);
    }

    public void setInputPasswordField(String inputPasswordField) {
        this.inputPasswordField.sendKeys(inputPasswordField);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }
}