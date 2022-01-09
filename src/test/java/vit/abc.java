	package vit;

	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import junit.framework.Assert;

	public class abc {

	WebDriver driver;
		
		@Before
		public void setUp() {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Alerts.html");
		}
		
		@Test
		public void droDown() {
			WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
			alertButton.click();
			
			Alert alert = driver.switchTo().alert();
			
			System.out.println("Text of alert is: " +alert.getText());  //Fetching the alert text
			
			Assert.assertEquals("Alert is not matching" , "I am an alert box!", alert.getText());
			
			alert.accept();
		}
		
		@After
		public void tearDown() {
		driver.quit();
		}

	}


}
