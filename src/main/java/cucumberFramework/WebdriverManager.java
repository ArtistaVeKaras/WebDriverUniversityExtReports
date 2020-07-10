package cucumberFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class WebdriverManager {

    @Test
    public void chromeDriverSetUp() {
        System.setProperty("webdriver.driver.chrome", "src/test/java/cucumberFramework/resources/chromedriver");

        //creare dirver obj for chrome
        WebDriver driver = new ChromeDriver();

        //Navigate to the url
        driver.get("https://tools.com");

    }

    @Test
    public void driverManager() {

        //setup the chrome using WebDriverManager
        WebDriverManager.chromedriver().setup();

        //create driver object for chrome and chrome options
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        1) Visit the URL​ ​https://checkout.pod-point.com/
        driver.get("https://checkout.pod-point.com/");

//        2) Select Mitsubishi and Outlander in the Select Your Car
        WebElement carSelect = driver.findElement(id("vehicleBrand"));
        Select dropDown = new Select(carSelect);
        dropDown.selectByIndex(14);

        WebElement model = driver.findElement(id("vehicleId"));
        Select secondDropDown = new Select(model);
        secondDropDown.selectByIndex(1);

//        3) Check the box ‘​I am NOT eligible to claim the dealership discount as I did not
//        come through a dedicated dealership’
        driver.findElement(id("optOut")).click();

//        4) Under Select your connection type, select the ‘Universal Socket’ option
        WebElement universlaEle = driver.findElement(xpath("//h4[contains(text(),'Universal Socket')]"));
        WebDriverWait wait4 = new WebDriverWait(driver, 30);
        wait4.until(ExpectedConditions.elementToBeClickable(universlaEle));

        //this works
        try{
            if (universlaEle.isDisplayed());
            universlaEle.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
            driver.quit();
//        5) Under Select your power rating, check the prices for the 7kw unit displayed
//        match the following values (​note that these are different to the prices in Section 1 as
//        the discounts have not yet been applied​):
//        a. Full Price – £879
//        b. With OLEV Grant - £529
        WebElement kwElement = driver.findElement(xpath("//h4[contains(text(),'7kW')]"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(kwElement));

        try{
            if (kwElement.isDisplayed());
            kwElement.click();
            System.out.println(kwElement.getText());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        WebElement visibleEle = driver.findElement(By.xpath("//h2[text()='Compatible extras']"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//h2[text()='Compatible extras']")));
        wait.until(ExpectedConditions.visibilityOf(visibleEle));
//        WebElement h2text = driver.findElement(By.xpath("//h2[text()='Compatible extras']"));
        System.out.println(visibleEle.getText());

//        6) Check that 6 compatible extras are shown
        WebElement extras = driver.findElement(By.xpath("//section[@id='optionalExtras']//div[@class='content-block']"));
        WebDriverWait waitEl = new WebDriverWait(driver, 10);
        waitEl.until(ExpectedConditions.visibilityOf(extras));
        extras.isDisplayed();


//        7) Select a random compatible extra
        WebElement extraOpt = driver.findElement(By.className("grid cards-same-height"));
        Select option = new Select(extraOpt);
        System.out.println(option.getOptions());
//        8) Ensure that the tota
//        driver.quit();
    }
}

