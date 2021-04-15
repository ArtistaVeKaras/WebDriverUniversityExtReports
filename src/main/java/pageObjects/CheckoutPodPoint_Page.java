package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

public class CheckoutPodPoint_Page extends BasePage {

    public @FindBy (className = "icon__img") WebElement jsAlert;
    public @FindBy (xpath= "//div[@class='cookie']") WebElement jsAlertFooter;
    public @FindBy(id = "vehicleBrand") WebElement vehicleBrand;
    public @FindBy(id = "vehicleId") WebElement vehicleId;
    public @FindBy(xpath = "//input[@id='optOut']") WebElement optOutCheckBox;
    public @FindBy(xpath = "//h4[contains(text(),'Universal Socket')]") WebElement connectionType;
    public @FindBy(xpath = "//h4[contains(text(),'7kW')]") WebElement powerRating;
    public @FindBy(xpath = "//section[@id='optionalExtras']//div[@class='content-block']") WebElement compatibleExtras;
    public @FindBy(xpath = "//span[contains(text(),'£879.00')]") WebElement fullPrice;
    public @FindBy(xpath = "//span[@class='h3 colour-primary'][contains(text(),'£529.00')]") WebElement withOlevGrant;
    public @FindBy(xpath = "//h4[contains(text(),'5m Portable cable')]") WebElement extrasOptPortableCable;
    public @FindBy(className = "p-b-none") WebElement totalPrice;

    public CheckoutPodPoint_Page() throws IOException {
        super();
    }

    public CheckoutPodPoint_Page getUrl(String url) throws IOException {
        getDriver().get(url);
        Actions actions = new Actions(driver);
        actions.moveToElement(jsAlert).click().build().perform();
        actions.moveToElement(jsAlertFooter).click().build().perform();
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page selectVehicleBrand(String carValue) throws IOException, InterruptedException {
        waitAndClickElement(vehicleBrand);
        Select dropDown = new Select(vehicleBrand);
        dropDown.selectByVisibleText(carValue);
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page selectCarId(String carId) throws IOException, InterruptedException {
        WaitUntilWebElementIsVisible(vehicleId);
        Select dropDown = new Select(vehicleId);
        dropDown.selectByVisibleText(carId);
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page clickOptOut() throws IOException, InterruptedException {
        optOutCheckBox.click();
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page connectionType(String connection) throws IOException, InterruptedException {
        //no need for the timeout as the test is not consistent
        WaitUntilWebElementIsVisible(connectionType);
        scrollToElementByWebElementLocator(connectionType);
        connectionType.click();
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page powerRatingOpt(String powerOpt) throws IOException, InterruptedException {
        Assert.assertEquals(fullPrice.getText(), "£879.00");
        Assert.assertEquals(withOlevGrant.getText(), "£529.00");
        WaitUntilWebElementIsVisible(powerRating);
        scrollToElementByWebElementLocator(powerRating);
        powerRating.click();
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page compExtrasIsDisplayed() throws IOException {
         WaitUntilWebElementIsVisible(compatibleExtras);
         compatibleExtras.isDisplayed();
        System.out.println(compatibleExtras.getText());
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page selectRandomExtra() throws IOException, InterruptedException {
        WaitUntilWebElementIsVisible(extrasOptPortableCable);
        extrasOptPortableCable.click();
        return new CheckoutPodPoint_Page();
    }

    public CheckoutPodPoint_Page totalUnitPrice() throws IOException, InterruptedException {
        WaitUntilWebElementIsVisible(totalPrice);
        Thread.sleep(5000);
        System.out.println(totalPrice.getText());
        if (totalPrice.isDisplayed()){
            Assert.assertEquals(totalPrice.getText(),"£1,058.00");
        }
        return new CheckoutPodPoint_Page();
    }
}
