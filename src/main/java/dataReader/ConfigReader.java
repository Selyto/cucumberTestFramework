package dataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	FileInputStream is;
	
   final String filename = "configs//config.properties";
	
	public ConfigReader() throws IOException {
		try {
		is = new FileInputStream(filename);
		prop = new Properties();
		prop.load(is);
		}
		catch(Exception e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
	
	 public String getURL(){
		 String url = prop.getProperty("URL");
		 if(url!= null) return url;
		 else throw new RuntimeException("URL not specified in the Configuration.properties file."); 
		 }
	 
	 public long getWaitTime(){
		 String sync = prop.getProperty("syncTime");
		 if(sync!= null) return Long.parseLong(sync);
		 else throw new RuntimeException("syncTime not specified in the Configuration.properties file."); 
		 }
	 
	 public String getbrowser(){
		 String browser = prop.getProperty("browser");
		 if(browser!= null) return browser;
		 else throw new RuntimeException("Browser not specified in the Configuration.properties file."); 
		 }
	 
	 public String getisRemote(){
		 String isremote = prop.getProperty("isRemote");
		 if(isremote!= null) return isremote;
		 else throw new RuntimeException("isRemote not specified in the Configuration.properties file."); 
		 }
	 
	 public String getHubURL(){
		 String hub = prop.getProperty("HubURL");
		 if(hub!= null) return hub;
		 else throw new RuntimeException("HUb not specified in the Configuration.properties file."); 
		 }
	 
	 public String getBrowserVersion(){
		 String version = prop.getProperty("Browser_Version");
		 if(version!= null) return version;
		 else throw new RuntimeException("Version not specified in the Configuration.properties file."); 
		 }
	
	 public String getExtentConfig() {
		 return System.getProperty("user.dir") + "./extent-config.xml";
	 }
}
