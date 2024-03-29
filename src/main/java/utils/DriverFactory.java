package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import demo.Log4jDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class DriverFactory {
	public static WebDriver driver;
	public static ContactUs_Page contactUsPage;
	public static Products_Page productsPage;
	public static WordPress_Page wordPressPage;
	public static Weebly_Page weebly_page;
	public static FillForm_Page fill_form;
	public static Log4jDemo log4jDemo;
	public static CheckoutPodPoint_Page checkoutPodPoint_page;

	public WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
			p.load(fis);
			String browserName = p.getProperty("browser");

			switch (browserName) {

				case "firefox":

					if (null == driver) {
						System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
						DesiredCapabilities capabilities = new DesiredCapabilities();
						capabilities.setCapability("marionette", true);
						driver = new FirefoxDriver();
//					maximising the gecko driver does not work as well it does with chrome
					}
					break;
				case "chrome":

					if (null == driver) {
//						System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
						// CHROME OPTIONS
                        WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
						driver.manage().window().maximize();
						driver.manage().deleteAllCookies();
				    	driver.manage().window().maximize();
					}
					break;

				case "ie":

					if (null == driver) {
						DesiredCapabilities capabilities = new DesiredCapabilities();
						System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
						capabilities.setCapability("ignoreZoomSetting", true);
				    	driver = new InternetExplorerDriver(capabilities);
						driver.manage().window().maximize();
					}
					break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
//			assert driver != null;
			driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);

			//initializing this page page elements
			contactUsPage = PageFactory.initElements(driver, ContactUs_Page.class);
			productsPage = PageFactory.initElements(driver, Products_Page.class);
			wordPressPage= PageFactory.initElements(driver, WordPress_Page.class);
			weebly_page= PageFactory.initElements(driver, Weebly_Page.class);
			fill_form= PageFactory.initElements(driver, FillForm_Page.class);
			log4jDemo= PageFactory.initElements(driver, Log4jDemo.class);
			checkoutPodPoint_page = PageFactory.initElements(driver, CheckoutPodPoint_Page.class);
		}
		return driver;
	}
}
