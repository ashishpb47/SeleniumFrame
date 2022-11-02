package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

	@Test
	
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("../FrameworkSelenium/src/test/resources/Executables/ChromeSetup.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Ind Vs Ban",Keys.ENTER);
		driver.quit();
		
		
	
	
	}
//		@Test
//		public void test2() {
//		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"src/test/resources/Executables/ChromeSetup.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("zim vs ned",Keys.ENTER);
//		driver.quit();
//		
//		
//	}
}
