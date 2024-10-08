package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PvrCinema {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.pvrcinemas.com/");
        driver.findElement(By.xpath("//span[text()='Cinema']")).click();
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'PVR AERO')]")).click();
        driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='LUBBER PANDHU'])[2]")).click();
        driver.findElement(By.xpath("((//li[@class='p-dropdown-item'])[5]//span)[2]")).click();
        driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.findElement(By.xpath("//span[@id='PE.PRIME|G:8']")).click();
        driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
        WebElement element = driver.findElement(By.xpath("//div[@class='ticket-value']/p"));
        String seatinfo = element.getText();
        System.out.println(seatinfo);
        WebElement element2 = driver.findElement(By.xpath("//div[@class='select-seat-number']//p"));
        String seatno = element2.getText();
        System.out.println(seatno);
        WebElement element3 = driver.findElement(By.xpath("(//h6//span)[4]"));
        String grandtot = element3.getText();
        System.out.println(grandtot);
        driver.findElement(By.xpath("//button[@class='sc-cHqXqK hmJMAl btn-proceeded']")).click();
        driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
        String title = driver.getTitle();
        if(title.contains("PV")) {
        	System.out.println("verified");
        }
        else {
        	System.out.println("not verified");
        }
        driver.quit();
        
	}

}
