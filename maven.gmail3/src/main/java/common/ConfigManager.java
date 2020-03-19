package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
	
	static Properties prop = new Properties();;
	public static Properties getProp() {
		return prop;
	}
	public static void setProp(Properties prop) {
		ConfigManager.prop = prop;
	}
	public static void loadProperties() throws IOException {
		FileInputStream input = new FileInputStream("D:\\eclipse-work\\maven.gmail3\\config.properties");
		prop.load(input);
		//prop.getProperty("environment");
		
	}
	/*public static Properties prop;
	
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"D:\\eclipse-work\\gmail2.maven\\src\\main\\java\\config\\config.properties");
		prop.load(ip);
	}
	catch (FileNotFoundException ex) {
		ex.printStackTrace();
	}
	catch(IOException ex) {
		ex.printStackTrace();
	}*/

}
