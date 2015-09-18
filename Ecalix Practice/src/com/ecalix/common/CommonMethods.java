package com.ecalix.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CommonMethods {
	public String sURL ="http://107.170.213.234/catalog/";
	public WebDriver driver;
	
	public void OpenBrowser(){
		driver= new FirefoxDriver();
		System.out.println("Open a Firefox Browser");
	}
	
	public void GotoUrl(){
		driver.get(sURL);
		System.out.println("navigating to"+sURL);

	}
	public void CloseBrowser(){
		driver.quit();
		System.out.println("Browser is close");
		
	}
	public void clickYourselflink(){
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		System.out.println("click you self link is clicked");
	}
	public void clicklogoff(){
		driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
		System.out.println("log off button is clicked");
		System.out.println("log off button is clicked");
<<<<<<< HEAD
=======
		System.out.println("log off button is clicked");
		System.out.println("log off button is clicked");
>>>>>>> branch 'master' of https://github.com/peter9012/test1.git
	}
	public void Login(String UserName, String Password){
		driver.findElement(By.xpath("//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys(UserName);
		System.out.println("User Name"+UserName+"entered");
		driver.findElement(By.xpath("//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Password);
		System.out.println("Password"+Password+"entered");
		driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
		System.out.println("Submit button is clicked");
		System.out.println("Test1");
		System.out.println("Test1");
		System.out.println("Test1");
		System.out.println("Test1");
		System.out.println("Test1");
		System.out.println("Test1");
		System.out.println("Test1");
		System.out.println("Test1");

	}
	

}
