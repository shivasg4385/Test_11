package Demo_Facebook_site;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Facebook_Home_page {
	
	WebDriver driver;
	//Declaration
	@FindBy(xpath="//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql rrkovp55 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m']//span")
	private List<WebElement> allopt;
	
	
	@FindBy(xpath="//div[@class='aov4n071']//span")
	private List<WebElement> allopt1;
	
	@FindBy(xpath="(//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql rrkovp55 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'])[5]")
	private WebElement Logout_1;

	//Initialization
	public Facebook_Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	
		public void displayAllOptions()
		{
			int count=allopt.size();
			
			System.out.println("Total number of options....\t"+count);
			
			for( WebElement opt:allopt)
			{
				String text=opt.getText();
				System.out.println("Opton: \t"+text);
			}
		}
		
		public void displayAllOptions1()
		{
			int count=allopt1.size();
			
			System.out.println("Total number of options....\t"+count);
			
			for( WebElement opt:allopt1)
			{
				String text=opt.getText();
				System.out.println("Opton: \t"+text);
			}
		}
		
		public void clickLogoutOption()
		{
			Logout_1.click();
		}
		
}
