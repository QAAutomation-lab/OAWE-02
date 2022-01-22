package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		/**
		 * 1. Get the Property file location using FileInputStream class
		 * 2. Create an instance of Properties class
		 * 3. call load method of properties class and pass the file location in it
		 * 4. using properties class ref. call getProperty(String key) which will return data 
		 *    from property based on key passed
		 */
		//using absolute path
		//FileInputStream fis=new FileInputStream("F:\\NewWorkspace\\JavaTraining\\TestData\appData.properties");
							//or
		//using relative path
		FileInputStream fis=new FileInputStream("./TestData/appData.properties");

		Properties prop=new Properties();
		
		prop.load(fis);
		
//		String appUrl=prop.getProperty("appUrl");
//		System.out.println(appUrl);
				//or
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}
}
