package cucumberFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumEssentials {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        fillInForm();
        scroolToElement();
        switchWindow();
        switchToAlert();
        javaScriptCommands();
        dragAndDrop();
        radioButton();
        datePiker();
        dropDown();
        uploadFile();
        implicitlyWait();
        explicitlyWait();
        WebForm();
    }

    //Open the browser and fill in the form (Task 1)
    @Test
    public static void fillInForm() throws InterruptedException {
        System.out.println("Hello");
        driver.get("https://google.com");
        WebElement first_name = driver.findElement(By.id("name"));
        first_name.click();
        first_name.sendKeys("Claudio");
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        Thread.sleep(1000);
    }
    //Open browser and perform a autocomplete (Task 2)
    @Test
    public static void autoComplete() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/java/cucumberFramework/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("87 Oxford Street, London, UK");
        Thread.sleep(1000);
        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();
    }

    //Scroll to element on the page (Task 3)
    public static void scroolToElement() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/scroll");
        //Actions will scroll the to the button of the page and click on the name field
        //This is because the name element is located at the button!
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Claudio Correia");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");
        Thread.sleep(1000);
    }

    //Switching to the original window
    public static void switchWindow() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton= driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();
        for (String handle1: driver.getWindowHandles()){

            driver.switchTo().window(handle1);
            Thread.sleep(1000);
        }
        //switches back to the original window
        driver.switchTo().window(originalHandle);
    }

    //Switching to the alert element
    public static void switchToAlert(){
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alert = driver.findElement(By.id("alert-button"));
        alert.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
    }

    //Performing JavaScript commands on the alert button
    public static void javaScriptCommands() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement element =driver.findElement(By.id("modal-button"));
        element.click();

        WebElement closeButton =driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",closeButton);
        Thread.sleep(1000);
        driver.quit();
    }

    //Performing drag and drop
    public static void dragAndDrop(){
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions action = new Actions(driver);
        action.dragAndDrop(image,box).build().perform();
    }

    //Performing radio button checks
    public static void radioButton() {
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='option3']"));
        radioButton3.click();
    }

    //Performing date picker
    public static void datePiker(){
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("01/01/2020");
        date.sendKeys(Keys.RETURN);
        driver.quit();
    }
    //Performing Dropdown
    public static void dropDown(){
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropMenu.click();
        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.click();
    }

    //Performing upload file
    public static void uploadFile(){
        driver.get("https://formy-project.herokuapp.com/fileupload");

        //File to be uploaded needs to be in the test dir
        WebElement uploadUploadField = driver.findElement(By.id("file-upload-field"));
        uploadUploadField.sendKeys("AkiraAv.jpg");
        //driver.quit();
    }

    //Implicitly wait will wait a couple seconds before something is performed
    public static void implicitlyWait(){
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("87 Oxford Street, London, UK");

        //Using the implicitly wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();
        driver.quit();
    }

    //Explicitly Wait will wait until a certain element is visible/displayed or clickable
    public static void explicitlyWait(){
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("87 Oxford Street, London, UK");

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement autoCompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        autoCompleteResult.click();
    }
    //Complete Web Form
    public static void WebForm(){
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("Claudio");
        driver.findElement(By.id("last-name")).sendKeys("Correia");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("09/09/9090");
        date.sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        driver.quit();
    }
}

