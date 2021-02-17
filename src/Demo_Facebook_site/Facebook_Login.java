package Demo_Facebook_site;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Login {

	WebDriver driver;
	//Declaration
	
	@FindBy(name="email")
	private WebElement Email_ID;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement Login_Btn;
	
	//Initialization
	
	public Facebook_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void enterEmailID()
	{
		Email_ID.sendKeys("Shivasg4385@gmail.com");
	}
	
	public void enterPassword()
	{
		pwd.sendKeys("Qwerty1234$");
	}
	public void Button_Login()
	{
		Login_Btn.click();
	}
	
	//Log off 
	
	
	

	
	
	
	
	
}
