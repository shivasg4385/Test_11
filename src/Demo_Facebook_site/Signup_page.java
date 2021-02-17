package Demo_Facebook_site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup_page {
	
	//Declaration

	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement Surname;
	
	@FindBy(name="reg_email__")
	private WebElement Email_MobileNo;
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement Confirm_Email;
	
	@FindBy(name="reg_passwd__")
	private WebElement New_Password1;
	
	@FindBy(name="birthday_day")
	private WebElement day;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement female;
	
	@FindBy(xpath="(//input[@name='sex'])[2]")
	private WebElement male;
	
	@FindBy(xpath="(//input[@name='sex'])[3]")
	private WebElement custom;

	@FindBy(name="websubmit")
	private WebElement SignUp_Button;	
	
	//Initialization
	
	public Signup_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterFirstname()
	{
		fname.sendKeys("SHIVAKUMAR");
	}
	
	public void enterSurname()
	{
		Surname.sendKeys("GANJI");
	}
	
	public void enterEmail_Mobile()
	{
		Email_MobileNo.sendKeys("shahapurshivakumar@gmail.com");
	}
	
	public void enterConfirm_Email()
	{
		Confirm_Email.sendKeys("shahapurshivakumar@gmail.com");
	}
	public void enterNewPassword()
	{
		New_Password1.sendKeys("Test1234$");
	}
	public void selectDay()
	{
		Select sel=new Select(day);
		sel.selectByIndex(3);
	}
	public void selectMonth()
	{
		Select sel=new Select(month);
		sel.selectByIndex(5);
	}
	public void selectYear()
	{
		Select sel=new Select(year);
		sel.selectByIndex(35);
	}
	
	public void clickOnFemaleRB() {
		female.click();
	}
	
	public void clickOnMaleRB() {
		male.click();
	}
	
	public void clickOnCustomRB() {
		custom.click();
	}
	
	public void clickonSignUpBT()
	{
		SignUp_Button.click();
	}
}
