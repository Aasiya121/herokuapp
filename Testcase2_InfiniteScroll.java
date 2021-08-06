import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2_InfiniteScroll 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/infinite_scroll");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
			
			int j = 0;
			while( j < 2 )
			{
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				j++;
				Thread.sleep(2000);
			}
			
			js.executeScript("window.scrollBy(0,-800)");

	}

}
