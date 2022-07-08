package rediff.stocks;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Stocks_Adding {
	@Test
	public void adding1() throws InterruptedException {
	
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
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
			
			
			
			driver.findElement(By.id("addStock")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("addstockname")).sendKeys("info");
	driver.findElement(By.id("13020007")).click();
	driver.findElement(By.id("stockAddDate")).sendKeys("05-07-2022");
	driver.findElement(By.name("addstockqty")).sendKeys("5");
	driver.findElement(By.id("addstockprice")).sendKeys("200");
	driver.findElement(By.id("addStockButton")).click();
	Thread.sleep(2000);
	
	
	try {
     driver.findElement(By.id("addStock")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("addstockname")).sendKeys("wipro");
	driver.findElement(By.id("11060011")).click();
	driver.findElement(By.id("stockAddDate")).sendKeys("04-07-2022");
	driver.findElement(By.name("addstockqty")).sendKeys("10");
	driver.findElement(By.id("addstockprice")).sendKeys("500");
	driver.findElement(By.id("addStockButton")).click(); 
	Thread.sleep(2000);
	
	driver.findElement(By.id("addStock")).click();
	 Thread.sleep(1000);
    driver.findElement(By.id("addstockname")).sendKeys("tata");
	driver.findElement(By.id("15510001")).click();
	driver.findElement(By.id("stockAddDate")).sendKeys("02-07-2022");
	driver.findElement(By.name("addstockqty")).sendKeys("5");
	driver.findElement(By.id("addstockprice")).sendKeys("400");
	driver.findElement(By.id("addStockButton")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("addStock")).click();
	 Thread.sleep(1000);
    driver.findElement(By.id("addstockname")).sendKeys("on");
	driver.findElement(By.id("12140006")).click();
	driver.findElement(By.id("stockAddDate")).sendKeys("03-07-2022");
	driver.findElement(By.name("addstockqty")).sendKeys("15");
	driver.findElement(By.id("addstockprice")).sendKeys("700");
	driver.findElement(By.id("addStockButton")).click();
	Thread.sleep(2000);
	 
	driver.findElement(By.id("addStock")).click();
	 Thread.sleep(1000);
   driver.findElement(By.id("addstockname")).sendKeys("maruti");
	driver.findElement(By.id("10520005")).click();
	driver.findElement(By.id("stockAddDate")).sendKeys("01-07-2022");
	driver.findElement(By.name("addstockqty")).sendKeys("12");
	driver.findElement(By.id("addstockprice")).sendKeys("300");
	driver.findElement(By.id("addStockButton")).click();
	Thread.sleep(1000);
	}catch(StaleElementReferenceException e) 
	{
		driver.findElement(By.id("addStock"));
	}
		driver.findElement(By.linkText("Sign Out")).click();;
		
	}

}
