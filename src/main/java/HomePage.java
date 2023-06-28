import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractObjectPage {

    @FindBy(css = ".nav.navbar-nav.navbar-right > a")
    private WebElement logoutLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogout() {
        this.logoutLink.click();
    }

    public String getLogoutText() {
        return this.logoutLink.getText();
    }
}