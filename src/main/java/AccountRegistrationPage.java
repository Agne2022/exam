import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends AbstractObjectPage {

    @FindBy(css = "input#username")
    private WebElement inputUsernameField;

    @FindBy(css = "input#password")
    private WebElement inputPasswordField;


    @FindBy(css = "input#passwordConfirm")
    private WebElement inputPasswordConfirmField;


    @FindBy(xpath = "//form[@id='userForm']/button[@type='submit']")
    private WebElement inputCreate;

    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void setInputUsernameField(String inputUsernameField) {
        this.inputUsernameField.sendKeys(inputUsernameField);
    }

    public void setInputPasswordField(String inputPasswordField) {
        this.inputPasswordField.sendKeys(inputPasswordField);
    }

    public void setInputPasswordConfirmField(String inputPasswordConfirmField) {
        this.inputPasswordConfirmField.sendKeys(inputPasswordConfirmField);
    }


    public void clickInputCreate() {
        inputCreate.click();

    }
}
