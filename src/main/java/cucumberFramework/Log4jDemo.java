package cucumberFramework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DriverFactory;

public class Log4jDemo extends DriverFactory {

    private static Logger logger = LogManager.getLogger(Log4jDemo.class);
    @Test
        public void performSomeTask() {

        logger.debug("Navigating to google url!!!");
        getDriver().get("https://www.google.com");
        getDriver().quit();

        //performing assertion on google Title
//            Assert.assertEquals("Google",getDriver().getTitle());
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
