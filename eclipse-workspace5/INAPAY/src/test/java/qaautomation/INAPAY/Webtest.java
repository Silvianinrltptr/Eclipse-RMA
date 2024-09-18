package qaautomation.INAPAY;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtest {
	
	@Test
	public void testLogin() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='flash']")).getText();
		
		//berbanding yg terjadi dan sesuai harapan
		String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "You logged into a secure areaaa!";
		assertTrue(actualText.contains(expectedText));
		
		driver.quit();
	}
	
		@Test
		public void testLoginWrongUsername() {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://google.com");
			driver.get("https://the-internet.herokuapp.com/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//div[@id='flash']")).getText();
			
			//berbanding yg terjadi dan sesuai harapan
			String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();
			String expectedText = "You logged into a secure areaaa!";
			assertTrue(actualText.contains(expectedText));
			
			driver.quit();	
		}
		
		@Test
		public void testLoginWrongPassword() {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://google.com");
			driver.get("https://the-internet.herokuapp.com/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("NotSuperSecretPassword!");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//div[@id='flash']")).getText();
			
			//berbanding yg terjadi dan sesuai harapan
			String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();
			String expectedText = "You logged into a secure areaaa!";
			assertTrue(actualText.contains(expectedText));
			
			driver.quit();	
		}
		
		@Test
		public void testLoginSpesialCharacter() {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://google.com");
			driver.get("https://the-internet.herokuapp.com/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("@#123tomsmith");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//div[@id='flash']")).getText();
			
			//berbanding yg terjadi dan sesuai harapan
			String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();
			String expectedText = "You logged into a secure areaaa!";
			assertTrue(actualText.contains(expectedText));
			
			driver.quit();
		}
		
		@Test
		public void testLoginUserNameHuruf() {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://google.com");
			driver.get("https://the-internet.herokuapp.com/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmithhurufdoang");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//div[@id='flash']")).getText();
			
			//berbanding yg terjadi dan sesuai harapan
			String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();
			String expectedText = "You logged into a secure areaaa!";
			assertTrue(actualText.contains(expectedText));
			
			driver.quit();	
		}
}
