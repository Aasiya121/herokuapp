import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Testcase3_Keypresses {
      

//For Enter Key
	@Test
       public void keyTest() throws InterruptedException 
	   {
        System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		Actions action= new Actions(driver);
		action.sendKeys(org.openqa.selenium.Keys.ENTER).build().perform();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You entered: ENTER");
		
		Thread.sleep(2000);
		
		Actions action1= new Actions(driver);
		action1.sendKeys(org.openqa.selenium.Keys.SPACE).build().perform();
		String text1 = driver.findElement(By.id("result")).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "You entered: SPACE");
		
		Thread.sleep(2000);
		
		
		Actions action2= new Actions(driver);
		action2.sendKeys(org.openqa.selenium.Keys.ESCAPE).build().perform();
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		Assert.assertEquals(text2, "You entered: ESCAPE");
		
		Thread.sleep(2000);
		
		Actions action3= new Actions(driver);
		action3.sendKeys(org.openqa.selenium.Keys.SHIFT).build().perform();
		String text3 = driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		Assert.assertEquals(text3, "You entered: SHIFT");
		Thread.sleep(2000);
		driver.close();
	}

}

      