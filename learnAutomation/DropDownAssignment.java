package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;//
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;//

public class DropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tool = new Select (drop);
		tool.selectByIndex(1);
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Frankfurt']")).click();
		WebElement course = driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
		course.sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();
	//	driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();//
		
		course.sendKeys("ap");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-value='Appium']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_3']")).click();
		
	//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		//WebElement element = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
	//	wait.until(ExpectedConditions.visibilityOf(element));//
		
	}

}
