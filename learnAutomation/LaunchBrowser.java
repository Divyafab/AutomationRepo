package learnAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		if(title.contains("Leaftaps"))
				{
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Title is not verified");
		}
		
		driver.close();//close the current browser 
		
	}

}

