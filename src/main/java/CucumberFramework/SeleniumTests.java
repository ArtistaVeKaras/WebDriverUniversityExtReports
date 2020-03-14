package CucumberFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import java.io.IOException;
public class SeleniumTests {

    public @FindBy(css = "#input_19_2_3") WebElement firstName;

    @Test
    public static void sauceLabs() throws IOException, InterruptedException {

        String ProjPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",ProjPath+"/src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://qumu.com/en/contact-us/");
        driver.findElement(By.cssSelector("#input_19_2_3")).sendKeys("Claudio");
        driver.findElement(By.cssSelector("#input_19_2_6")).sendKeys("Correia");
        driver.findElement(By.cssSelector("#input_19_3")).sendKeys("Claudio.corr@outlook.com");
        driver.findElement(By.cssSelector("#input_19_4")).sendKeys("Hugo");
        driver.findElement(By.cssSelector("#input_19_5")).sendKeys("000090909");
        driver.findElement(By.xpath("//option[contains(text(),'AT')]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Talk to an Expert')]")).click();
        driver.findElement(By.cssSelector("#input_19_8")).sendKeys("My first comment of the day");
        driver.findElement(By.xpath("//body[@class='page-template-default page page-id-54411 style-color-wayh-bg group-blog smooth-scroller hmenu hmenu-position-right header-full-width main-center-align wpb-js-composer js-comp-ver-4.12.1 vc_responsive window-scrolled']")).click();
        driver.findElement(By.cssSelector("#gform_submit_button_19")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
