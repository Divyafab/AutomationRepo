package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiBank {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/welcome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("divyafab2222@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Divya@123");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Divya");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Darshini");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("P");
		driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Female");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Miss");
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys("Fulltime");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("01/26/2003");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Divyafab");
		String title = driver.getTitle();
		if(title.contains("UiBank")) {
			System.out.println("Verified");
		}
		else {
			System.err.println("Not verified");
		}
	}
	
	

}
