package pageObjects;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.List;

public class FillForm_Page extends BasePage{

    public @FindBy(xpath = "//h1[contains(text(),'Complete Web Form')]") WebElement CompleteFormText;
    public @FindBy(xpath = "//a[@class='btn btn-lg'][contains(text(),'Complete Web Form')]") WebElement completeForm;
    public @FindBy(css = "#first-name") WebElement firstName;
    public @FindBy(css = "#last-namee1") WebElement lastName;
    public @FindBy(css = "#job-title") WebElement jobTitle;
    public @FindBy(xpath = "//a[@class='btn btn-lg btn-primary']")WebElement Submit;
    public  static String url = "https://formy-project.herokuapp.com/";

    public FillForm_Page () throws IOException {
        super();
    }

    public FillForm_Page getUrl(){
        getDriver().get(url);
        return fill_form;
    }

    public FillForm_Page clickCompleteForm(){
        Actions actions = new Actions(driver);
        actions.moveToElement(completeForm);
        completeForm.click();
        return fill_form;
    }

    public FillForm_Page webFormIsDisplayed(){
       WaitUntilWebElementIsVisible(CompleteFormText);
       System.out.println(CompleteFormText.getText());
        return fill_form;
    }
    public FillForm_Page enterUserDetails(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(firstName,data.get(2).get(0));
        sendKeysToWebElement(lastName,data.get(0).get(1));
        sendKeysToWebElement(jobTitle,data.get(1).get(2));
        return fill_form;
    }
    public FillForm_Page clickSubmitButton() throws Exception {
        Actions action= new Actions(driver);
        action.moveToElement(Submit);
        Submit.click();
//        actionMoveAndClick(Submit);
        return fill_form;
    }
    public FillForm_Page confirmMessgeIsDisplayed(){

        return fill_form;
    }
}
