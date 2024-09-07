package learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GigaTech Solutions");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DivyaDarshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pushparaj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Divyafab");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Softwaretester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5,00,000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("750");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("7371");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("A software tester is an individual who uses their skills and expertise with computers to make sure certain computer programs operate as intended.");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Software testing is a method of determining whether the actual software product meets the expected requirements and ensuring that the software product is free of defects.");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6383187449");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divyafab@gamil.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("VinothRaj");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No. 1, New Bangaru Naidu Colony");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("12th Main Road, Vijaya Nagar,Velacheri");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600020");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("05");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if(title.contains("opentaps")){
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
			
		
	}

}
