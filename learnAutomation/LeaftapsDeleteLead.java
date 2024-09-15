package learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		/*ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//form[@id='login']//input")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//p/input)[3]")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]/span")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91"); //how in adv-xpath 
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("6383187448");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));	
        String leadId = element.getText();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		Thread.sleep(5000);
		WebElement noRecords = driver.findElement(By.xpath("//div[text()='No records to display']"));
        String text = noRecords.getText();
        if(text.equals("No records to display")) {
        	System.out.println(leadId +"deleted");
        }else {
        	System.out.println(leadId +"not deleted");
        }
        */
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.findElement(By.xpath("//form[@id='login']//input")).sendKeys("Democsr");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.xpath("(//p/input)[3]")).click();
				driver.findElement(By.xpath("//div[@id='label']/a")).click();
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]/span")).click();
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).click();
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91"); //how in adv-xpath 
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("6383187448");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(5000);
		        WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));	
		        String leadId = element.getText();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		        Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
				//
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				WebElement noRecords = driver.findElement(By.xpath("//div[text()='No records to display']"));
		        String text = noRecords.getText();
		        if(text.equals("No records to display")) {
		        	System.out.println(leadId +"deleted");
		        }else {
		        	System.out.println(leadId +"not deleted");
		        }
				
				
			}
		
		
	}

