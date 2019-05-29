import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury_Regstration_DB extends ReadingDataDromDB{
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		ReadingDataDromDB db=new ReadingDataDromDB();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");	
		driver.findElement(By.name("firstName")).sendKeys(db.a.get(index));
		driver.findElement(By.name("lastName")).sendKeys(a.get(0));
		driver.findElement(By.name("phone")).sendKeys(a.get(0));
		driver.findElement(By.id("userName")).sendKeys(a.get(0));
		
		System.out.println("dvbiubv");
		
	}

}
