package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	 By assistance_link=By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/section/div/div/div[2]/a[2]/div");
	 
	 public void ClickAssistance()
		{
			try{	
				driver.findElement(assistance_link).click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
		        		(By.xpath("//*[@id=\"app-layer-base\"]/div/main/div")));   
		        wait.until(ExpectedConditions.elementToBeClickable
		        		(By.xpath("//*[@id=\"home_children_button\"]"))).click();
		        System.out.println("Clicked the checkbox");		
			}
			catch (Exception e) {
				System.out.println("Exception interceptée" + e.getMessage());
			}
		}

}
