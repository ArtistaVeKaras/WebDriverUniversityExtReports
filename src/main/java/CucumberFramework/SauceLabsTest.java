package CucumberFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceLabsTest {

    public static final String USERNAME = "akiira_009";
    public static final String ACCESS_KEY ="";
    public static final String URL = "https://" + USERNAME +  ":" + ACCESS_KEY +"";
    public static String googleUrl= "https://google.co.uk";

    @Test
    public static void sauceLabs(){

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform","linux");
        caps.setCapability("version","latest");
        caps.setCapability("name","GoogleTest1");

        String ProjPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",ProjPath+"/src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(googleUrl);
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("automation step by step");
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
        System.out.println("get title " + driver.getTitle());

        driver.quit();
    }
}