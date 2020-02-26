package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;

public class WordPress_Page extends BasePage{


    public @FindBy(css = "#email") WebElement textfield_Email;
    public @FindBy(css = "#username") WebElement textfield_Username;
    public @FindBy(css = "#password") WebElement textfield_Password;
    public @FindBy(xpath = "//button[@class='button signup-form__submit form-button is-primary']") WebElement textfield_CreateAccountButton;


    public WordPress_Page () throws IOException {
        super();
    }

    public WordPress_Page enterEmail() throws Exception {
        sendKeysToWebElement(textfield_Email,"claudiooartista@hotmail.co.uk");
        return wordPressPage;
    }
    public WordPress_Page enterUsername() throws Exception {
        sendKeysToWebElement(textfield_Username, "Akira");
        return wordPressPage;
    }
    public WordPress_Page enterPassword() throws Exception {
        sendKeysToWebElement(textfield_Password, "hip-poptuga01");
        return wordPressPage;
    }
    public WordPress_Page clickCreateAccoutnButton() throws IOException, InterruptedException {
        waitAndClickElement(textfield_CreateAccountButton);
        return wordPressPage;
    }
    public WordPress_Page validationOfWordPressMainPage(){
    //Assertion not possible to perform atm!!
        return wordPressPage;
    }
}
