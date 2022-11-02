package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ResultSearchPage {
	
WebDriver driver;
	
	public ResultSearchPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By resultsearch = By.id("smartlabel");
	
	public void VerifText()
	{
		String resulttext = driver.findElement(resultsearch).getText();
		assertEquals(resulttext, "Résultats de la recherche");
	}

}
