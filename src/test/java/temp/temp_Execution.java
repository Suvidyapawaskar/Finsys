package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class temp_Execution {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\04062018\\chromedriver_win32_66\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:90/finsys/login.html");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("dummycfo");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("passw0rd");
		driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']")).click();
		driver.findElement(By.xpath("//a[@title='Manage Company']")).click();
		driver.switchTo().frame(0);
		Thread.sleep(30);
		driver.findElement(By.xpath("//a[@onclick='newItem()']/*[1]/*")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Aahana Technologies");
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='companytype']")));
		s.selectByVisibleText("IT");
		Thread.sleep(30);
		
		Select s1 = new Select(driver.findElement(By.xpath("//input[@value='Select Subtype']")));
		Thread.sleep(30);
		s1.selectByVisibleText("Service");
		driver.findElement(By.xpath("//input[@textboxname='address']/following-sibling::*")).sendKeys("Pune");
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[2]/td[4]/span/textarea")).sendKeys("Pune");
		//driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9934545");
		
		
		
	}

}
