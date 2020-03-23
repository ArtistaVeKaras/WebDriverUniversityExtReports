package utils;

public class Constant {

	/**Config Properties file **/
	// TODO: modified one of the String sueggeste by sonar Lint to "public static final String"

	public static final String CONFIG_PROPERTIES_DIRECTORY = "properties/config.properties";
	public final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/resources/other/geckodriver";
	public final static String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/resources/other/chromedriver";
	public final static String IE_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/resources/other/IEDriverServer";
}
