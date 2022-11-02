package pages;

import static org.testng.Assert.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AssistancePage {
	
WebDriver driver;
	
	public AssistancePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	//By assistance_link=By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/section/div/div/div[2]/a[2]/div");
	By textverify = By.xpath("//*[@id=\"contextual-banner\"]/div/h1");
	By searchbox = By.id("search-term");
	By clicksearch = By.xpath("//*[@id=\"search-container\"]/label/button");
	
	
	
	public void VerifTextassistance()
	{
		String assistancetext = driver.findElement(textverify).getText();
		
		assertEquals(assistancetext, "L’agent virtuel est à votre disposition.");
		
	}
	
	
	public void search(String Searchinput) 
	{
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			driver.findElement(clicksearch).click();
			
		} catch(Exception e) {
			System.out.println("Exception interceptée" + e.getMessage());
		}
		
		
	}
}
