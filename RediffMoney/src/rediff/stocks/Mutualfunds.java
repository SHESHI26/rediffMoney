package rediff.stocks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mutualfunds {
    @Test
	public void adding2() throws InterruptedException {
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
		driver.findElement(By.id("addmf")).click();
		driver.findElement(By.id("mfname")).sendKeys("icici");
		driver.findElement(By.id("14058410,2066")).click();
		driver.findElement(By.name("mfinitialAmt")).sendKeys("5000");
		driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
		driver.findElement(By.id("mfprice")).sendKeys("750");
	    driver.findElement(By.id("addMFButton")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("addmf")).click();
		driver.findElement(By.id("mfname")).sendKeys("lic");
		driver.findElement(By.id("140513340,2066")).click();
		driver.findElement(By.name("mfinitialAmt")).sendKeys("6000");
		driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
		driver.findElement(By.id("mfprice")).sendKeys("600");
		driver.findElement(By.id("addMFButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addmf")).click();
		driver.findElement(By.id("mfname")).sendKeys("shri");
		driver.findElement(By.id("140510304,2066")).click();
		driver.findElement(By.name("mfinitialAmt")).sendKeys("4000");
		driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
		driver.findElement(By.id("mfprice")).sendKeys("200");
		driver.findElement(By.id("addMFButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addmf")).click();
		driver.findElement(By.id("mfname")).sendKeys("hdfc");
		driver.findElement(By.id("14057993,2066")).click();
		driver.findElement(By.name("mfinitialAmt")).sendKeys("7000");
		driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
		driver.findElement(By.id("mfprice")).sendKeys("700");
		driver.findElement(By.id("addMFButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addmf")).click();
		driver.findElement(By.id("mfname")).sendKeys("sbi");
		driver.findElement(By.id("14058450,2066")).click();
		driver.findElement(By.name("mfinitialAmt")).sendKeys("10000");
		driver.findElement(By.id("addMFDate")).sendKeys("05/07/2022");
		driver.findElement(By.id("mfprice")).sendKeys("500");
		driver.findElement(By.id("addMFButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		}

}
