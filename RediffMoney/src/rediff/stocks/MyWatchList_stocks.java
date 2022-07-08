package rediff.stocks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyWatchList_stocks {
    @Test
	public void adding3() throws InterruptedException {
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
	       
			
			driver.findElement(By.linkText("My Watchlist")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-stock-button")));
			driver.findElement(By.id("add-stock-button")).click();
			driver.findElement(By.id("stocksearch")).sendKeys("tata");
			driver.findElement(By.id("13020033")).click();
			driver.findElement(By.name("maxprice")).sendKeys("500");
			driver.findElement(By.name("minprice")).sendKeys("100");
			driver.findElement(By.id("add-stock-submit")).click();
			Thread.sleep(2000);
			
			
			try {
			driver.findElement(By.id("add-stock-button")).click();
			driver.findElement(By.id("stocksearch")).sendKeys("reddy");
			driver.findElement(By.id("12540015")).click();
			driver.findElement(By.name("maxprice")).sendKeys("600");
			driver.findElement(By.name("minprice")).sendKeys("50");
			driver.findElement(By.id("add-stock-submit")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"add-stock-button\"]")).click();
			driver.findElement(By.id("stocksearch")).sendKeys("reliance");
			driver.findElement(By.id("12300011")).click();
			driver.findElement(By.name("maxprice")).sendKeys("1000");
			driver.findElement(By.name("minprice")).sendKeys("200");
			driver.findElement(By.id("add-stock-submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("add-stock-button")).click();
			driver.findElement(By.id("stocksearch")).sendKeys("Adani");
			driver.findElement(By.id("16610041")).click();
			driver.findElement(By.name("maxprice")).sendKeys("600");
			driver.findElement(By.name("minprice")).sendKeys("300");
			driver.findElement(By.id("add-stock-submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("add-stock-button")).click();
			driver.findElement(By.id("stocksearch")).sendKeys("Ashok");
			driver.findElement(By.id("10510001")).click();
			driver.findElement(By.name("maxprice")).sendKeys("400");
			driver.findElement(By.name("minprice")).sendKeys("150");
			driver.findElement(By.id("add-stock-submit")).click();
			Thread.sleep(2000);
		}catch(StaleElementReferenceException e) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-stock-button")));
		}
		 driver.findElement(By.linkText("Sign Out")).click();
	}

}
