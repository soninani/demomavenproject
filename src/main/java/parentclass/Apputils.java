package parentclass;

import java.awt.Event;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;





public class Apputils {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
		
		public Apputils(){
		
		try {
			prop=new Properties();
			FileInputStream fi=new FileInputStream("C:\\softwares Qedge\\eclipse\\com.naveentestmahi\\config.properties");
			prop.load(fi);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		}
		public static void intilization(){
		
		
		String browsername=prop.getProperty("browser");
		
		System.out.println(browsername);
		
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}else if (browsername.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get(prop.getProperty("url"));
		
		
	}	

}
