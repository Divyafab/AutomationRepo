package learnAutomation;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserEdge {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whatsapp.com/");
		String title = driver.getTitle();
		if(title.contains("WhatsApp")) {
			System.out.println("Verified");
		}
			else{
				System.out.println("Not Verified");
			}
		driver.quit();//close the entire browser
		}
	}


