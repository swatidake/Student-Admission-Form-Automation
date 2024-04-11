package com.fbs.formdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StudentAdmissionForm {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://127.0.0.1:5500/Form/index.html";

		WebDriver driver;
		//Instantiate a ChromeDriver class
		driver = new ChromeDriver();

		// navigate(open) to this URL
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement std = driver.findElement(By.name("firstname")); // Enter first name
		std.sendKeys("Riya");
		driver.findElement(By.name("middlename")).sendKeys("Vijay");// middle name
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Mehara");// last name
		Thread.sleep(1000);
		driver.findElement(By.id("mn")).sendKeys("9898989898");// Mobile Number
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("riyamehara@gmail.com");// email
		Thread.sleep(1000);
		driver.findElement(By.name("address")).sendKeys("Mumbai, Maharashtra");// address
		Thread.sleep(1000);
		driver.findElement(By.id("Female")).click();// gender
		Thread.sleep(1000);

		// Date of Birth
		Select date = new Select(driver.findElement(By.id("Birthday_Day")));// date
		date.selectByIndex(4);// using index
		Select month = new Select(driver.findElement(By.id("Birthday_Month")));// month
		month.selectByValue("May");// using value
		Select year = new Select(driver.findElement(By.name("BirthdayYear")));// year
		year.selectByVisibleText("2000");// using visible text
		Thread.sleep(1000);

		Select q = new Select(driver.findElement(By.name("qualification")));// select qualification options
		q.selectByIndex(1);// using index
		Thread.sleep(1000);

		// using xpath(Select subjects)
        //relative xpath
		driver.findElement(By.xpath("//div[contains(text(),'Which programming languages you want to take :')]//input[1]")).click(); 
		driver.findElement(By.xpath("/html/body/div/form/div[2]/input[2]")).click();// full xpath
		Thread.sleep(1000); 

		driver.findElement(By.xpath("//*[@id=\"agree\"]")).click();// terms and condition
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();// click on submit

		// click on the alert box
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();// click the OK button

		Thread.sleep(3000);
		driver.quit();// closes all the tabs/windows
		//Reporter.Log("This is the demo testng class",true);
	}

}
