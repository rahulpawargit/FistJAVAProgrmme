package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select.*;


public class TestScenario2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		driver.findElement(By.name("name")).sendKeys("rahul");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmpassword")).sendKeys("12345");
		driver.findElement(By.name("insert")).click();
	
		driver.findElement(By.name("First_Name")).sendKeys("Rahul");
		driver.findElement(By.name("Last_Name")).sendKeys("Pawar");
		
		WebElement element=driver.findElement(By.id("Birthday_Day"));
		new Select(element).selectByVisibleText("8");
		WebElement element2=driver.findElement(By.id("Birthday_Month"));
		new Select(element2).selectByVisibleText("Apr");
		
		WebElement element3=driver.findElement(By.id("Birthday_Year"));
		new Select(element3).selectByVisibleText("2011");
	    
		
		driver.findElement(By.name("Email_Id")).sendKeys("rahul.pawar@gmail.com");
		driver.findElement(By.name("Mobile_Number")).sendKeys("9856321254");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input[1]")).click();
		
		//WebElement element4=driver.findElement(By.name("Gender")).get(0);
		
		driver.findElement(By.name("insert")).click();

		driver.findElement(By.name("Address")).sendKeys("Nagar,Tal and Dist -NAgar");
		driver.findElement(By.name("City")).sendKeys("Nagar");
		driver.findElement(By.name("Pin_Code")).sendKeys("123456");
	    driver.findElement(By.name("State")).sendKeys("India");
		
	
		WebElement ele=driver.findElement(By.name("Country"));
		new Select(ele).selectByVisibleText("India");
	   
		
		driver.findElement(By.name("insert")).click();
		
		driver.findElement(By.name("Hobby_Drawing")).click();
		driver.findElement(By.name("Hobby_Singing")).click();
		driver.findElement(By.name("Hobby_Dancing")).click();
		driver.findElement(By.name("Hobby_Other")).click();
		driver.findElement(By.name("Other_Hobby")).sendKeys("Other details");
		
		//driver.findElement(By.linkText("back")).click();
		
		driver.findElement(By.name("insert")).click();
		
		driver.close();
		
		
		
		

	}


		
	

}
