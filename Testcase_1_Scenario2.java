import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_1_Scenario2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tom");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	    

	}

}
