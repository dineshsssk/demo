package qaclick;;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class qaadem 
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Garen\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
}
	@Test(dataProvider="d")
	public void open(String username, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).clear();
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys(password);
		Thread.sleep(2000);
				
	}
	
	@AfterTest
	public void tearsdown()
	{
		driver.close();

	}
	
	@DataProvider(name="datas")
	public Object[][] getdata()
	{
	Object[][] obj = new Object[3][2];	
	obj[0][0] = "dineshkumar";
	obj[0][1] =  "sdksk";
	
	obj[1][0] = "rajesh";
	obj[1][1] =  "sailesh";
	
	obj[2][0] = "vinay";
	obj[2][1] =  "welcome";
	
	
		return obj;
		
	}
	
	
}
