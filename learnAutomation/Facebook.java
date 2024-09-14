package learnAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("(//form[@data-testid='royal_login_form']//input)[3]")).sendKeys("");
		driver.findElement(By.xpath("(//form[@data-testid='royal_login_form']//a)[3]")).click();
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input")).sendKeys("Divya");
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']//input")).sendKeys("fab");
		driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[1]")).sendKeys("6383187448");
		driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']//input")).sendKeys("Divyafab2126");
		WebElement bday = driver.findElement(By.xpath("//div[@id='birthday_wrapper']//select"));
		Select date = new Select(bday);
		date.selectByValue("26");
		WebElement bmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(bmonth);
		month.selectByVisibleText("Jan");
		WebElement byear = driver.findElement(By.xpath("//select[@title='Year']"));
		Select year = new Select(byear);
		year.selectByIndex(21);
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//input")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
	}

}
