package com.selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class BaseClass{
    public WebDriver driver;
    public void applaunch(){
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://orangehrm.com/");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        By demobutton = By.xpath("//button[@type='button' and normalize-space()='Book a Free Demo']");
        WebElement ele = w.until(ExpectedConditions.elementToBeClickable(demobutton));
        ele.click();
        driver.findElement(By.xpath("//input[@placeholder='Full Name*']")).sendKeys("Raviteja");
        driver.findElement(By.xpath("//input[@placeholder='Work Email*']")).sendKeys("ravi@cap.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number*']")).sendKeys("9955995588");
        //WebElement count = driver.findElement(By.xpath("//select[@name='Country']"));
        //Select country = new Select(count);
        //country.selectByVisibleText("India
	//")
      //  WebElement noe = driver.findElement(By.xpath("//select[@name='NoOfEmployees']"));
        //Select numberofemployees = new Select(noe);
        //numberofemployees.selectByValue("11 - 50");

        
        
        
    }
    public void closeapp(){
        driver.quit();
    }
}