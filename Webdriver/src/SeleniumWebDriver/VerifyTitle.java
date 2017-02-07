package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VerifyTitle {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Register Page"));
		
	}
	


	

}
