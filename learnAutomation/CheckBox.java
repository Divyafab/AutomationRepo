package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//a/span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//div[@class='grid formgrid']//div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//div[2]")).click();
		driver.findElement(By.xpath("((//div[@class='grid formgrid'])[4]//div)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget']/div)[2]")).click();
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@aria-label='Filter Input']"));
        element.sendKeys("London");
        driver.findElement(By.xpath("//li[@data-item-value='London']/div")).click();
        driver.findElement(By.xpath("//a[@aria-label='Close']/span")).click();
      
		
		
	}

}
