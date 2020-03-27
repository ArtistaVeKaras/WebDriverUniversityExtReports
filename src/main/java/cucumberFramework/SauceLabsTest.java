package cucumberFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class SauceLabsTest {
   //TODO: extedn this class to DriverFactory to avoid setting up the driver again

    public static final String USERNAME = "akiira";
    public static final String ACCESS_KEY ="e0de27f8-f0da-4acf-b735-88ffbf8e4d76";
    public static final String URL = "https://" + USERNAME +  ":" + ACCESS_KEY +"@ondemand.saucelabs.com:443/wd/hub";
    public static String googleUrl= "https://google.co.uk";

    @Test
    public static void sauceLabs() throws MalformedURLException {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform","linux");
        caps.setCapability("version","latest");
        caps.setCapability("name","GoogleTest1");

//        Running the test in SauceLabs
//        WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),caps);
//        Running the test on local webdriver
        String ProjPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",ProjPath+"/src/test/java/cucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(googleUrl);
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("automation step by step");
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
        System.out.println("get title " + driver.getTitle());

        driver.quit();
    }
}
