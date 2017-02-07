package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Registration {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		//driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
			
		driver.findElement(By.name("firstName")).sendKeys("Rahul");
		driver.findElement(By.name("lastName")).sendKeys("Pawar");
		driver.findElement(By.name("phone")).sendKeys("9762032715");
		driver.findElement(By.name("userName")).sendKeys("pwrahul");
		driver.findElement(By.name("address1")).sendKeys("Warje");
		driver.findElement(By.name("address2")).sendKeys("Pune");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("MH");
		driver.findElement(By.name("postalCode")).sendKeys("41521");
		
		WebElement element = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		new Select(element).selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("pwrahul");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("register")).click();
		driver.close();
		
	}

}
