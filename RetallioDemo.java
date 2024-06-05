package org.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RetallioDemo {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();    
        	driver.manage().window().maximize();
        	driver.get("https://order.retailio.in/rio/secure-login");
        //	driver.findElement(By.xpath("//span[text()='Login']")).click();
        	driver.findElement(By.xpath("//input[@placeholder='Enter Email or Mobile Number']")).sendKeys("8939317229");
        	driver.findElement(By.xpath("//div[@class='ydhIl helper-text']")).click();
        	driver.findElement(By.xpath("//button[@name='Continue']")).click();
        	Thread.sleep(15000);
        	driver.findElement(By.xpath("//div[text()=\"Hospital\"]")).click();
        	Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class='QB4Nd']//button")).click();
            driver.findElement(By.xpath("//input[@placeholder='Enter Hospital Name']")).sendKeys("Apollo Hospital");
            driver.findElement(By.xpath("//input[@placeholder='Please enter pincode']")).sendKeys("600002");
            driver.findElement(By.xpath("//input[@name='addressLine1']")).sendKeys("No:23/31 George Town,Perambur");
            driver.findElement(By.xpath("//input[@name='addressLine2']")).sendKeys("No:23/31 George Town,Perambur");
            driver.findElement(By.xpath("//input[@placeholder='Select City']")).sendKeys("Chennai");
            driver.findElement(By.xpath("//li[text()='Chennai']")).click();
            driver.findElement(By.xpath("//div[@class='QB4Nd']//button")).click();
            driver.findElement(By.xpath("//a[text()='Complete later']")).click();
	}
}
