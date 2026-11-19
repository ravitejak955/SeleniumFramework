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
        
        
        
    }
    public void closeapp(){
        driver.quit();
    }
}