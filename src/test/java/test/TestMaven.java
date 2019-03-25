package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestMaven {
	
	@Test
	private void firstMaven() {
		
		System.out.println("##########################Test###############################");
		
		
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.setBinary("C:\\Users\\Mutturaj\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		/*ystem.setProperty("webdriver.gecko.driver", "C:\\Users\\Mutturaj\\Desktop\\Softs\\geckodriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();*/
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("Ttile is "+driver.getTitle());
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("UCLA");
		
		
		driver.findElement(By.xpath("//input[@class='nav-input' and @value='Go']")).click();
		
		
		driver.quit();
		
		System.out.println("##########################Test###############################");
	

	}

}
