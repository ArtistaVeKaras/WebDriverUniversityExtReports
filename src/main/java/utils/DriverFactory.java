package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class DriverFactory {
	public static WebDriver driver;
	public static ContactHelp_Page contactHelp_Page;
	public static ManageYourInstall_Page manageYourInstall_page;

	public static WebDriver getDriver() {
		try {
			// Reads the Config file
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
			p.load(fis);
			String browserName = p.getProperty("browser");

			switch (browserName) {

				case "firefox":
					//setup firefox driver
					if (null == driver) {
						WebDriverManager.firefoxdriver().setup();
						DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						capabilities.setCapability("marionette", true);
						driver = new FirefoxDriver();
						driver.manage().window().maximize();
					}
					break;
				case "chrome":
					//setup chrome driver
					if (null == driver) {
                        WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
						driver.manage().window().maximize();
						//driver.manage().deleteAllCookies();
					}
					break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			//assert driver != null;
			driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);

			//initializing this page page elements
			contactHelp_Page= PageFactory.initElements(driver, ContactHelp_Page.class);
			manageYourInstall_page= PageFactory.initElements(driver, ManageYourInstall_Page.class);
		}
		return driver;
	}
}
