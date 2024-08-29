package swaglabloginpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoswag {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\selenium automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        
        driver.findElement(By.xpath("//input[@id='login-button']")).submit();
        

	}

}
