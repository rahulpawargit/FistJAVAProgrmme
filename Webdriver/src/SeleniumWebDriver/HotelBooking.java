package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Wait;

public class HotelBooking {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://phptravels.net/");
		driver.findElement(By.linkText("Hotels")).click();
		//driver.findElement(By.xpath(".//*[@id='HOTELS']/div/form/div[1]/div/div/input")).click();
	   WebElement ele1= driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/form/div[1]/div/div/input"));
	   ele1.sendKeys("Dubai");
	   driver.findElement(By.name("checkin")).click();
	   driver.findElement(By.xpath("html/body/div[9]/div[1]/table/tbody/tr[5]/td[4]")).click();
	   driver.findElement(By.name("checkout")).click();
	  // driver.findElement(By.xpath("html/body/div[10]/div[1]/table/tbody/tr[5]/td[7]")).click();
	  WebElement adl=driver.findElement(By.name("adults"));
	  new Select(adl).selectByVisibleText("3");
	  WebElement chld=driver.findElement(By.name("child"));
	  new Select(chld).selectByVisibleText("1");
	  driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/form/div[6]/div/button")).click();
	  		
	  //driver.close();
	  
	   
	  
	 
		
	}

	

}