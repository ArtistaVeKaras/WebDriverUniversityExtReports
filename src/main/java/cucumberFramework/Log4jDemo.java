package cucumberFramework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import utils.DriverFactory;
import java.io.IOException;

public class Log4jDemo extends DriverFactory {

    private static Logger logger = LogManager.getLogger(Log4jDemo.class);

    public Log4jDemo() throws IOException {
    }

    @Test
        public void performSomeTask() throws IOException, InterruptedException {

        logger.info("This is an info message");
        logger.debug("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }

}
