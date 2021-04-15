package utils;

public class Constant {

	/**Config Properties file **/
	// TODO: modified one of the String suggested by sonar Lint to "public static final String"


	protected static final String CONFIG_PROPERTIES_DIRECTORY = "properties/config.properties";
	protected final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/cucumberFramework/resources/geckodriver";
	protected final static String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/cucumberFramework/resources/chromedriver";
	protected final static String IE_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/cucumberFramework/resources/IEDriverServer";

	//deleted the other dir contain the other drivers
}
