package Demo_Facebook_site;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ID_1_Signup_page {

	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("Clicking Signup button");
		Facebook_login_or_Signup_page np=new Facebook_login_or_Signup_page(driver);
		np.Navigate_Signup_page();
		Thread.sleep(2000);
		System.out.println("Signup window opened!!!!!");
//		driver.findElement(By.name("firstname")).sendKeys("Test");
		Signup_page sup=new Signup_page(driver);
		sup.enterFirstname();
		Thread.sleep(2000);
		
		sup.enterSurname();
		Thread.sleep(2000);
		
		sup.enterEmail_Mobile();
		Thread.sleep(2000);
		
		sup.enterConfirm_Email();
		Thread.sleep(2000);
		
		sup.enterNewPassword();
		Thread.sleep(2000);
		
		sup.selectDay();
		Thread.sleep(2000);
		
		sup.selectMonth();
		Thread.sleep(2000);
		
		sup.selectYear();
		Thread.sleep(2000);
		
	/*	sup.clickOnFemaleRB();
		Thread.sleep(2000);*/
		
		sup.clickOnMaleRB();
		Thread.sleep(2000);
		
	/*	sup.clickOnCustomRB();
		Thread.sleep(2000);
		*/
		sup.clickonSignUpBT();
		Thread.sleep(10000);
		System.out.println("User Registration successful");
		driver.quit();
		Thread.sleep(10000);		
	}
}

