package propertyFileOp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadData {

	public static void main(String[] args) throws IOException {
		
		//Step1: Create an instance of FileInputStream class and pass property file location to its constructor
			//using absolute path
		//FileInputStream fis=new FileInputStream("F:\\SeleniumWorkspace\\SeleniumEve2\\testdata\\appData.properties");
			//using relative path
		FileInputStream fis=new FileInputStream(".\\testdata\\appData.properties");
		
		//Step2: Create an instance of Properties class
		Properties prop=new Properties();
		
		//Step3: call load() method of Properties class and pass FileInputStream instance as an argument to it
		prop.load(fis);
		
		//step4: read the required data from property file based on the Key defined in the file
		String url=prop.getProperty("appUrl");
		System.out.println("Applicaition URL: "+url);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("loginPageTitle"));
	}

}
