package cucumberFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SauceLabsTest {
   //TODO: extend this class to DriverFactory to avoid setting up the driver again

    static WebDriver driver;
    public static final String USERNAME = "akiira";
    public static final String ACCESS_KEY ="e0de27f8-f0da-4acf-b735-88ffbf8e4d76";
    public static final String URL = "https://" + USERNAME +  ":" + ACCESS_KEY +"@ondemand.saucelabs.com:443/wd/hub";

    @Test
    public static void sauceLabs() {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform","linux");
        caps.setCapability("version","latest");
        caps.setCapability("name","GoogleTest1");

//        Running the test in SauceLabs
//        WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),caps);
//        Running the test on local webdriver
        String ProjPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",ProjPath+"/src/test/java/cucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(URL);
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("automation step by step");
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
        System.out.println("get title " + driver.getTitle());

        driver.quit();
    }

    @Test
    public static void sample(){
        System.out.println("Starting Test...!");
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://ebay.com");
         driver.close();
    }
}
