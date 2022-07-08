package Addingstocks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adding_Stocks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://portfolio.rediff.com/portfolio-login");
		Thread.sleep(2000);
		 	
	
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
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("addStock")).click();
	 Thread.sleep(1000);
    driver.findElement(By.id("addstockname")).sendKeys("tata");
	driver.findElement(By.id("15510001")).click();
	driver.findElement(By.id("stockAddDate")).sendKeys("02-07-2022");
	driver.findElement(By.name("addstockqty")).sendKeys("5");
	driver.findElement(By.id("addstockprice")).sendKeys("400");
	driver.findElement(By.id("addStockButton")).click();
	

	Thread.sleep(3000);
	driver.findElement(By.id("addStock")).click();
	 Thread.sleep(1000);
    driver.findElement(By.id("addstockname")).sendKeys("oil");
	driver.findElement(By.id("12140006")).click();
	driver.findElement(By.id("stockAddDate")).sendKeys("03-07-2022");
	driver.findElement(By.name("addstockqty")).sendKeys("15");
	driver.findElement(By.id("addstockprice")).sendKeys("700");
	
	driver.findElement(By.id("addStockButton")).click();
	

	Thread.sleep(3000);
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

	Thread.sleep(2000);
	driver.findElement(By.id("addmf")).click();
	driver.findElement(By.id("mfname")).sendKeys("icici");
	driver.findElement(By.id("14058410,2066")).click();
	driver.findElement(By.name("mfinitialAmt")).sendKeys("5000");
	driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
	driver.findElement(By.id("mfprice")).sendKeys("750");
    driver.findElement(By.id("addMFButton")).click();
    
	Thread.sleep(3000);
    driver.findElement(By.id("addmf")).click();
	driver.findElement(By.id("mfname")).sendKeys("lic");
	driver.findElement(By.id("140513340,2066")).click();
	driver.findElement(By.name("mfinitialAmt")).sendKeys("6000");
	driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
	driver.findElement(By.id("mfprice")).sendKeys("600");
	driver.findElement(By.id("addMFButton")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.id("addmf")).click();
	driver.findElement(By.id("mfname")).sendKeys("shriram");
	driver.findElement(By.id("140510304,2066")).click();
	driver.findElement(By.name("mfinitialAmt")).sendKeys("4000");
	driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
	driver.findElement(By.id("mfprice")).sendKeys("200");
	driver.findElement(By.id("addMFButton")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.id("addmf")).click();
	driver.findElement(By.id("mfname")).sendKeys("hdfc");
	driver.findElement(By.id("14057993,2066")).click();
	driver.findElement(By.name("mfinitialAmt")).sendKeys("7000");
	driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
	driver.findElement(By.id("mfprice")).sendKeys("700");
	driver.findElement(By.id("addMFButton")).click();
	
	
	Thread.sleep(3000);
	driver.findElement(By.id("addmf")).click();
	driver.findElement(By.id("mfname")).sendKeys("sbi");
	driver.findElement(By.id("14058450,2066")).click();
	driver.findElement(By.name("mfinitialAmt")).sendKeys("10000");
	driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
	driver.findElement(By.id("mfprice")).sendKeys("500");
	driver.findElement(By.id("addMFButton")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("My Watchlist")).click();
	 WebDriverWait wait = new WebDriverWait (driver, 20);
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
	}catch(WebDriverException e1){driver.findElement(By.id("add-stock-button"));}
	
	
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("My Portfolio")).click();
	
	Thread.sleep(2000);
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
