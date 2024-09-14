package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceEditTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(" vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click(); // adv-xpath how//
		WebElement oppclick = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", oppclick);
		driver.findElement(By.xpath("//div[@part='input-container']/input")).sendKeys("Divya");
		
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a"));
		driver.executeScript("arguments[0].click()", element);		
		WebElement edit = driver.findElement(By.xpath("//li[@class='uiMenuItem']/a"));
		driver.executeScript("arguments[0].click()", edit);
		
		driver.findElement(By.xpath("//lightning-datepicker[@variant='label-stacked']//input")).clear();
		driver.findElement(By.xpath("(//span[@class='test-id__field-value slds-size_1-of-1'])[4]//input")).sendKeys("15/09/2024");
		//driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[4]")).clear();
		driver.findElement(By.xpath("(//lightning-base-combobox[@class='slds-combobox_container'])[4]//span")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();
		WebElement element2 = driver.findElement(By.xpath("(//div[@role='none']/button)[5]"));
		driver.executeScript("arguments[0].click()", element2);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='In progress']")).click();
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("SalesForce");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();

		
		
		
	}

}
