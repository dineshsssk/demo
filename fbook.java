package qaclick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbook {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Garen\\Downloads\\eclipse and selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dinesh200790@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dineshsuresh");
        driver.findElement(By.xpath("//button[@name='login']")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        
	}

}
