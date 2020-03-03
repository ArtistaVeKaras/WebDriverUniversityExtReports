package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;
import java.sql.Struct;

public class Weebly_Page extends BasePage{
    public @FindBy(css= "#weebly-username") WebElement usernameEmail;
    public @FindBy(css = "#weebly-password") WebElement usernamePassword;
    public @FindBy(css = "input[value='Log In']") WebElement loginButton;
    public @FindBy(xpath = "//button[contains(text(),'Support')]") WebElement iconProfile;

    public Weebly_Page() throws IOException {
        super();
    }

    public Weebly_Page enterUsername(String userName) throws Exception {
        sendKeysToWebElement(usernameEmail, userName);
        return weebly_page;
    }
    public Weebly_Page enterPassword(String password) throws Exception {
        sendKeysToWebElement(usernamePassword, password);
        return weebly_page;
    }
    public Weebly_Page clickLoginButton() throws IOException, InterruptedException {
        waitAndClickElement(loginButton);
        return weebly_page;
    }

    public Weebly_Page confirmWeeblyHomePage() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver,1000);
        // Assertion One
//        WebElement supportIcon = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[contains(text(),'Support')]"))));
//        Assert.assertEquals(supportIcon.getText(),"Support");

        //Assertion Two needs thread.sleep to pass option onw is best
        Thread.sleep(5000);
        WebElement support = getDriver().findElement(By.xpath("//button[contains(text(),'Support')]"));
        Assert.assertEquals(true,support.isDisplayed());
        return weebly_page;
    }
}
