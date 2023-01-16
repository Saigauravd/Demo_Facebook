package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Conf {
	
	
	public static  String  prop(String  value) throws IOException
	{
		Properties pro = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\test\\resource\\fconfig.properties";
		
		FileInputStream fis= new FileInputStream(path); 
		pro.load(fis);
		
		String values = pro.getProperty(value);
		
		return values;
		
		
		
	}

}
