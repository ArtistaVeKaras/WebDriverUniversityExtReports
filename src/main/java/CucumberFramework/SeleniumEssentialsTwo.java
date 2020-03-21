package CucumberFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumEssentialsTwo {

    public static String url = "https://google.com";

    public static void main(String[] args) {
//        clickAndHold();
//        contextClick();
//        doubleClick();
//        movceToElement();
//        dragAndDropBy();
          release();
        }

    @Test
//    It will move to the element and clicks (without releasing) in the middle of the given element.
    public static void clickAndHold() {
        System.setProperty("webdriver.chrome.driver","src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);

            // Store 'google search' button web element
            WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
            Actions actionProvider = new Actions(driver);
            // Perform click-and-hold action on the element
            actionProvider.clickAndHold(searchBtn).build().perform();
        } finally {
            driver.quit();
        }
    }
    @Test // This method firstly performs a mouse-move to the location of the element and performs the context-click (right click) on the given element.
    public static void contextClick(){
        System.setProperty("webdriver.chrome.driver","src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);

            // Store 'google search' button web element
            WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
            Actions actionProvider = new Actions(driver);
            // Perform context-click action on the element
            actionProvider.contextClick(searchBtn).build().perform();
        } finally {
            driver.quit();
        }
    }
    @Test //It will move to the element and performs a double-click in the middle of the given element.
    public static void doubleClick(){
        System.setProperty("webdriver.chrome.driver","src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);

            // Store 'google search' button web element
            WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
            Actions actionProvider = new Actions(driver);
            // Perform double-click action on the element
            actionProvider.doubleClick(searchBtn).build().perform();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
    @Test //This method moves the mouse to the middle of the element. The element is also scrolled into the view on performing this action.
    public static void movceToElement(){
        System.setProperty("webdriver.chrome.driver","src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);

            // Store 'Gmail' anchor web element
            WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
            Actions actionProvider = new Actions(driver);
            // Performs mouse move action onto the element
            actionProvider.moveToElement(gmailLink).build().perform();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test //This method firstly performs a click-and-hold on the source element, moves to the given offset and then releases the mouse.
    public static void dragAndDropBy(){
        System.setProperty("webdriver.chrome.driver","src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to Url
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            // Store 'box A' as source element
            WebElement sourceEle = driver.findElement(By.id("draggable"));
            // Store 'box B' as source element
            WebElement targetEle = driver.findElement(By.id("droppable"));
            int targetEleXOffset = targetEle.getLocation().getX();
            int targetEleYOffset = targetEle.getLocation().getY();
            Actions actionProvider = new Actions(driver);
            // Performs dragAndDropBy onto the  target element offset position
            actionProvider.dragAndDropBy(sourceEle, targetEleXOffset, targetEleYOffset).build().perform();
        } finally {
            driver.quit();
        }
    }

    @Test //This action releases the depressed left mouse button. If WebElement is passed, it will release depressed left mouse button on the given WebElement
    public static void release(){
        System.setProperty("webdriver.chrome.driver","src/test/java/CucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to Url
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            // Store 'box A' as source element
            WebElement sourceEle = driver.findElement(By.id("draggable"));
            // Store 'box B' as source element
            WebElement targetEle = driver.findElement(By.id("droppable"));
            Actions actionProvider = new Actions(driver);
            actionProvider.clickAndHold(sourceEle).moveToElement(targetEle).build().perform();
            // Performs release event
            actionProvider.release().build().perform();
        } finally {
            driver.quit();
        }
    }
}

