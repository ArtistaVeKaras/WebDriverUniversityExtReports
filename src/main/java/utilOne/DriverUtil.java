package utilOne;import org.openqa.selenium.WebDriver;import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.firefox.FirefoxDriver;public class DriverUtil {    // instantiate this is an object    public static WebDriver driver;    // this is a method to set the drivers    public void setdrivers(String browser) {        // ProjectPath stores the the user dir in a variable        // to allow the project to used in any other machine        String projectPath = System.getProperty("user.dir");        System.out.println("ProjectPath : "+ projectPath);        if (driver == null && browser.equalsIgnoreCase("firefox")) {            System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/java/util/drivers/geckodriver.exe");            driver = new FirefoxDriver();        }        else if (driver == null && browser.equalsIgnoreCase("chrome")){            System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/util/drivers/chromedriver.exe");            driver = new ChromeDriver();        }        else if (driver == null && browser.equalsIgnoreCase("ie")){            System.setProperty("webdriver.iedriver.driver", projectPath+"/src/test/java/util/drivers/iedriver.exe");            driver = new ChromeDriver();        }    }    public void tearDown() {        driver.quit();    }    public void setDriverBestWay(){        String projectPath = System.getProperty("user.dir");        System.out.println("ProjectPath : "+ projectPath);        System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/java/util/drivers/geckodriver.exe");        driver = new FirefoxDriver();    }}