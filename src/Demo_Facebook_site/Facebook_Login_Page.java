package Demo_Facebook_site;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_Login_Page {

	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook Login process....");
		Facebook_Login log=new Facebook_Login(driver);
		
		log.enterEmailID();
		Thread.sleep(2000);
		
		log.enterPassword();
		Thread.sleep(2000);
		
		log.Button_Login();
		Thread.sleep(2000);
		
		System.out.println("Facebook login successful");
		
		Thread.sleep(2000);
		
		System.out.println("Log-off process begins..");
		System.out.println("---------------------------------------------------------------------");
		Facebook_Home_page hp=new Facebook_Home_page(driver);
		hp.displayAllOptions();
		Thread.sleep(2000);
		hp.displayAllOptions1();
		Thread.sleep(2000);
		hp.clickLogoutOption();
		
	/*	driver.findElement(By.xpath("//img[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv']")).click();
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='nqmvxvec j83agx80 cbu4d94t tvfksri0 aov4n071 bi6gxh9e l9j0dhe7']/..//div[@class=\"ow4ym5g4 auili1gw rq0escxv j83agx80 buofh1pr g5gj957u i1fnvgqd oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 tgvbjcpo hpfvmrgz qt6c0cv9 rz4wbd8a a8nywdso jb3vyjys du4w35lb bp9cbjyn btwxx1t3 l9j0dhe7\"]"));
		
		for(WebElement ele1:ele)
		{
			String text=ele1.getText();
			System.out.println("Option :\t"+text);
		}
		
		driver.findElement(By.xpath("(//div[@class='nqmvxvec j83agx80 cbu4d94t tvfksri0 aov4n071 bi6gxh9e l9j0dhe7']/..//div[@class=\"ow4ym5g4 auili1gw rq0escxv j83agx80 buofh1pr g5gj957u i1fnvgqd oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 tgvbjcpo hpfvmrgz qt6c0cv9 rz4wbd8a a8nywdso jb3vyjys du4w35lb bp9cbjyn btwxx1t3 l9j0dhe7\"])[7]")).click();*/
		//driver.findElement(By.xpath("(//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql rrkovp55 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'])[5]")).click();
		//System.out.println("Facebook logged off successfully....");
		System.out.println("Logged off successfully");
		driver.close();
	}

}
