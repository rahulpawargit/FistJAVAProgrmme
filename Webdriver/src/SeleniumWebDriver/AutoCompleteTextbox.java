package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoCompleteTextbox {

	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://phptravels.net/");
		driver.findElement(By.name("txtSearch")).click();
	    driver.findElement(By.name("txtSearch")).clear();
	    driver.findElement(By.name("txtSearch")).sendKeys("dub");
	    driver.findElement(By.id("typeahead-3-679-option-1")).click();
	    
}
}