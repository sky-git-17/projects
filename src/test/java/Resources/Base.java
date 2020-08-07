package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public WebDriver InitilizeDriver() throws IOException  {
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\E2E\\src\\test\\java\\Resources\\data.properties");
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		}
		else if(BrowserName=="firefox") {
			
		}
		
	else if(BrowserName=="IE") {
			
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
		
		
	}

}
