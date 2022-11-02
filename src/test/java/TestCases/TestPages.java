package TestCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AssistancePage;
import pages.HomePage;
import pages.ResultSearchPage;


public class TestPages {
	
	WebDriver driver;
	AssistancePage ap;
	HomePage hp;
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();		
		//driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.expedia.fr/");	
	}
	
	@Test(priority=1)
	public void LinkAssistance()throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.ClickAssistance(); 
	}
	
	@Test(priority=2)
	public void Textagent()throws InterruptedException
	{
		ap = new AssistancePage(driver);
		ap.VerifTextassistance();
	}
	
	
	@Test(priority=3)
	public void SearchOperation() throws InterruptedException
	{
		AssistancePage page = new AssistancePage(driver);
		page.search("Enregistrement");
		
	}
	
	@Test(priority=4)
	public void VerifTextResult()throws InterruptedException
	{
		ResultSearchPage page = new ResultSearchPage(driver);
		page.VerifText();
	}
	
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	
	}

}
