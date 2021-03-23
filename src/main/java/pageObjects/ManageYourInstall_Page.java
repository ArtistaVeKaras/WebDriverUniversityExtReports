package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.DriverFactory;

import java.io.IOException;

public class ManageYourInstall_Page extends BasePage {

    //Initialise page obj elements
    public @FindBy(xpath = "//div[@class='large-3 cell sidebar-side-column']//a[normalize-space()='Installation']") WebElement installationBtn;
    public @FindBy(className = "smaller") WebElement headerSmarterMeter;
    public @FindBy(xpath = "//a[normalize-space()='Send us an email']") WebElement sendUsEmailBtn;
    public @FindBy(xpath = "//a[normalize-space()='ALLOW ALL']") WebElement clearCookieBtn;
    public @FindBy(xpath = "//h3[contains(text(),'Have a question about your install?')]") WebElement haveQuestionLink;
    public @FindBy(tagName = "h1") WebElement installHeader;
    public @FindBy(name = "sub_id") WebElement dropDownList;
    public @FindBy(css =  "input.button") WebElement submitBtn;
    public @FindBy(css = "label.error") WebElement errorMessage;

    public ManageYourInstall_Page() throws IOException {
        super();
    }

    public ManageYourInstall_Page clickInstallationBtn() throws IOException, InterruptedException {
        waitAndClickElement(installationBtn);
        return new ManageYourInstall_Page();
    }
    public ManageYourInstall_Page checkInstallationPageLoads() throws Exception {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://utilita.co.uk/help/installation");
        Assert.assertEquals(headerSmarterMeter.getText(), "Installing your Smart Meter");
        return new ManageYourInstall_Page();
        //return this; ist the same as the above
    }

    public ManageYourInstall_Page clickSendUsAnEmailBtn() throws Exception {
        jsPageScroll(1000, 1000);
        System.out.println(sendUsEmailBtn.getText());
        isElementClickable(sendUsEmailBtn);
        waitAndClickElement(sendUsEmailBtn);
        return new ManageYourInstall_Page();
    }

    public ManageYourInstall_Page checkDropDownMenuIsVivisvle() throws IOException, InterruptedException {
        WaitUntilWebElementIsVisible(haveQuestionLink);
        Assert.assertEquals(haveQuestionLink.getText(), "Have a question about your install?");
        return new ManageYourInstall_Page();
    }

    public ManageYourInstall_Page clickHaveAQuestionBtn() throws IOException, InterruptedException {
        waitAndClickElement(haveQuestionLink);
        return new ManageYourInstall_Page();
    }

    public ManageYourInstall_Page checkInstallQuestionFormPageLoads() throws IOException {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://utilita.co.uk/contact/install-question");
        Assert.assertEquals(installHeader.getText(),"Have a question about your install?");
        return new ManageYourInstall_Page();
    }

    public ManageYourInstall_Page selectDropDowmOption() throws Exception {
        clickOnTextFromDropdownList(dropDownList, "A question about my install");
        return new ManageYourInstall_Page();
    }

    public ManageYourInstall_Page clickSubmitBtn() throws IOException, InterruptedException {
        waitAndClickElement(submitBtn);
        return new ManageYourInstall_Page();
    }

    public ManageYourInstall_Page getErrorMassage(String message) throws IOException {
        WaitUntilWebElementIsVisible(errorMessage);
        Assert.assertEquals(errorMessage.getText(), message);
        return new ManageYourInstall_Page();
    }
}
