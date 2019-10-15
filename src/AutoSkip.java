import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSkip {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  
		driver.get("http://login.herzing.edu");
		  
		//Test Case 1
		  
		WebElement username = driver.findElement(By.id("frmLogin_UserName"));
		WebElement password = driver.findElement(By.id("frmLogin_Password"));
		  
		username.sendKeys("usernameGoesHere");
		password.sendKeys("");
		  
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		
		

	}
}
