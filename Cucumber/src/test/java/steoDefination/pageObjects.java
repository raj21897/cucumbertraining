package steoDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjects {

	WebDriver driver;
	public pageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
										   }
	@FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")
	public static WebElement signin;
	
	
	@FindBy(name = "userName")
	public static WebElement userName;
	
	
	@FindBy(name = "password")
	public static WebElement password;
	
	
	@FindBy(name = "Login")
	public static WebElement login;
	
	
	
	
	
}
