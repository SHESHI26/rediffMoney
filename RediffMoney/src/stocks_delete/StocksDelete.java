package stocks_delete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class StocksDelete {
     @Test
	public void delete() throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/");
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Sign In")).click();
		 
		 WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("useremail")));
		  driver.findElement(By.id("useremail")).sendKeys("sandisheshi@gmail.com");
		  driver.findElement(By.id("userpass")).sendKeys("sheshi@26");
		    driver.findElement(By.id("loginsubmit")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("deletePortfolio")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(4000);
			driver.findElement(By.id("createPortfolioButton")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.linkText("My Watchlist")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-stock-button")));
			while(true) {
				try
				{
			driver.findElement(By.xpath("//*[@alt='Delete']")).click();
			
			driver.findElement(By.linkText("Yes")).click();
			Thread.sleep(2000);
			 
			}catch(StaleElementReferenceException e)
				{
                   break; 
				}catch(Exception e) {
					System.out.println("all stocks deleted");
					break;
				}
			}
			
	driver.findElement(By.linkText("Sign Out")).click();
	driver.close();
	}
			
}	
          
	


