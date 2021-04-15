package applitools;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.config.Configuration;
import com.applitools.eyes.metadata.BatchInfo;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VisualTesting {

    protected static final String API_KEY = "X3Eo101KLteLrZB8FvLd100MTPoEedfGHU97pqxIrG2Ui3Jw110";
    private static WebDriver driver;
    private static Eyes eyes;
    private static BatchInfo batch;
    private static EyesRunner runner;

    @BeforeTest
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeClass
    public static void setUpBatch(){

        //Create a batch is optional but recommended
//        batch = new BatchInfo();

        //initialize a runner for your test
        runner = new ClassicRunner();

        //initialize the eyes SDK
        eyes = new Eyes();
//        eyes.setApiKey(API_KEY);

        setUp();

    }

    @Test
    public static void loginTest(){

        driver.get("https:docker.com");

        //Start the test
//        eyes.open(driver, "Login Test","Test", new RectangleSize(800, 800));

       //Take a screenshot so AI can analyze and ignore large displacements
//        eyes.checkWindow("Login Window");

        //End the test
//        eyes.close();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
//        eyes.abort();
    }


//    public Eyes eyes(){
//        Eyes eyes= new Eyes();
//        eyes.setApiKey(API_KEY);
//        return eyes;
//    }
}
