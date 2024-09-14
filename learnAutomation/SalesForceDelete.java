package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceDelete {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
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
		WebElement delete = driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Opportunity.Delete']"));
		driver.executeScript("arguments[0].click()", delete);
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		WebElement OpportunityFound = driver.findElement(By.xpath("//a[text()='Salesforce Automation by Divyadarshini']"));
        String text = OpportunityFound.getText();
        if(text.equals("Salesforce Automation by Divyadarshini")) {
			System.out.println("Opportunity is Found");
		}
		else {
			System.out.println("Opportunity is deleted");
		}
	
	}

}
