package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
 public ReadConfig(){
		File src = new File("./Configuration/config.properties");
		try{
			
			FileInputStream fs = new FileInputStream(src);
			pro = new Properties();
			pro.load(fs);
		} catch(Exception e){
			System.out.println("exception ...: "+e.getMessage());
		}
	}
		public String getUrl() {
			
			String url = pro.getProperty("loginsite");
			return url;
		}
		
public String getUsername() {
			
			String user = pro.getProperty("username");
			return user;
		}
public String getPasswordl() {
	
	String paswrd = pro.getProperty("pwrd");
	return paswrd;
}
public String getChrome() {
	
	String chromepath = pro.getProperty("chromepath");
	return chromepath;
}
	}
	
	

