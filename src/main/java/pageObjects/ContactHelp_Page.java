package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class ContactHelp_Page extends BasePage{

    public @FindBy(css= ".main-menu > li:nth-of-type(4) > a") WebElement helpIcon;
    public @FindBy(className = "title") WebElement homeHeaderTitle;
    public @FindBy(css = "h1") WebElement helpHeaderTitle;
    public @FindBy(xpath= "//a[normalize-space()='Manage your install']") WebElement manageYourInstallationBtn;
    public @FindBy(tagName =  "h1") WebElement installHeaderPage;
    public @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll") WebElement cookieBtn;

    public ContactHelp_Page() throws IOException {
        super();
    }
    public ContactHelp_Page getUrl(String url) throws Exception {
        getDriver().get(url);
        actionMoveAndClick(cookieBtn);
        String URL = getDriver().getCurrentUrl();

        //assert homePage has loaded
        Assert.assertEquals(URL ,"https://utilita.co.uk/");
        Assert.assertEquals(homeHeaderTitle.getText() ,"Pay As You Go energy made simple.");
        return new ContactHelp_Page();
    }
    public ContactHelp_Page clickHelpBtn() throws IOException, InterruptedException {
        waitAndClickElement(helpIcon);
        return new ContactHelp_Page();
    }
    public  ContactHelp_Page checkHelpPageLoads() throws IOException {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://utilita.co.uk/help");
        Assert.assertEquals(helpHeaderTitle.getText() , "How can we help?");
        return new ContactHelp_Page();
    }
    public ContactHelp_Page clickManageYourInstallation() throws IOException, InterruptedException {
        waitAndClickElement(manageYourInstallationBtn);
        return new ContactHelp_Page();
    }

    public ContactHelp_Page checkManageyourInstallationPage() throws IOException {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://utilita.co.uk/contact/manage-your-install");
        Assert.assertEquals(installHeaderPage.getText(), "Manage your Install");
        return new ContactHelp_Page();
    }
}
