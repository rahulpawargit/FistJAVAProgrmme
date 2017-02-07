package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class EmailLogin {

	public static void main(String[] args) {

WebDriver driver=new FirefoxDriver();
driver.get("https://accounts.google.com/");
driver.findElement(By.id("Email")).sendKeys("agrawalsandeep1993@gmail.com");
driver.findElement(By.id("rc-button rc-button-submit")).click();
driver.findElement(By.id("Passwd")).sendKeys("sandeep@1");
driver.findElement(By.id("signIn")).click();

	}

}
