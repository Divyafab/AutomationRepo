package learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		driver.findElement(By.id("email")).sendKeys("divyadivya2126@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Divyafab");
		driver.findElement(By.id("loginbutton")).click();
		String title = driver.getTitle();
		if(title.contains("Log in to Facebook"))
		{
			System.out.println("verified");
		}
		else {
			System.out.println("Not Verified");
		}
	}

}
