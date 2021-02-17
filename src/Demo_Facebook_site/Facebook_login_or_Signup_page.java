package Demo_Facebook_site;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_or_Signup_page {
	//WebDriver driver;
	//Declaration
	@FindBy(xpath="//a[@id='u_0_2']") 
	
	private WebElement signup;
	
	//Initialization
	public Facebook_login_or_Signup_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void Navigate_Signup_page()
	{
		signup.click();
	}

}
