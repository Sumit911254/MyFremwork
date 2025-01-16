package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadFiles {

	Properties properties;

	String path="D:\\framWork\\FramWork\\Configuration\\config.properties";

	//Constecter

	public ReadFiles() {
		try {
			properties =new Properties();


			FileInputStream fis=new FileInputStream(path);

			properties.load(fis);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	//GetBase Url

	public String getbaseurl() {

		String value=properties.getProperty("baseurl");


		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("url not found");
		}
	}

	//GetBase Browser

	public String getBrowser() {
		String value=properties.getProperty("browser");

		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("browser not found");
		}
	}

}
