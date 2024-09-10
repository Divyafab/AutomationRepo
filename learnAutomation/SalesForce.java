package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    WebElement leadButton = driver.findElement(By.xpath("//span[text()='Leads']"));
	    driver.executeScript("arguments[0].click()", leadButton);
	    driver.findElement(By.xpath("//button[text()='New']")).click();
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Divya");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Darshini");
	    driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TCS");
	    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	
	}

}