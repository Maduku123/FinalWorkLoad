package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static Properties pro;
	public static WebDriver driver;
public BaseClass() {
	pro=new Properties();
	try {
		FileInputStream file=new FileInputStream("C:\\Users\\cashp\\eclipse-workspace\\FinalWorkLoad"
				+ "\\src\\properties\\config.properties");
		pro.load(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void initiazation() {
	String browser=pro.getProperty("browser");
	System.setProperty(pro.getProperty("chromeKey"),pro.getProperty("chromePath"));
	 driver = new ChromeDriver();
		driver.get(pro.getProperty("QAurl"));
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
}
public void tearDown() {
	driver.close();
}
}
