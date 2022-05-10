package configUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectReader {
	Properties objProp;
	public ObjectReader() throws IOException {
		// TODO Auto-generated constructor stub
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framework\\ObjectRepository\\object.properties";
		FileInputStream fis=new FileInputStream(path);
		objProp =new Properties();
		objProp.load(fis);	
	}
	public String getChromeKey() {
		return objProp.getProperty("ChromeKey");		
	}
	public String getChromePath() {
		return objProp.getProperty("ChromePath");

	}
	public String getBaseURL() {
		return objProp.getProperty("BaseURL");

	}
	public String getNavigateURL(){
		return objProp.getProperty("NavigateURL");

	}

}
