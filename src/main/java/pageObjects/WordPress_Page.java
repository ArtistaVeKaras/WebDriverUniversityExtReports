package pageObjects;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.List;

public class WordPress_Page extends BasePage{
    public @FindBy(css = "#email") WebElement textfield_Email;
    public @FindBy(css = "#username") WebElement textfield_Username;
    public @FindBy(css = "#password") WebElement textfield_Password;
    public @FindBy(xpath = "//button[@class='button signup-form__submit form-button is-primary']") WebElement textfield_CreateAccountButton;

    public WordPress_Page () throws IOException {
        super();
    }

    public WordPress_Page enterEmail(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(textfield_Email, data.get(row).get(column));
        return wordPressPage;
    }
    public WordPress_Page enterUsername(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(textfield_Username, data.get(row).get(column));
        return wordPressPage;
    }
    public WordPress_Page enterPassword(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(textfield_Password,data.get(row).get(column));
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
