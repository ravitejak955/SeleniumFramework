package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class BaseClass{
    public WebDriver driver;
    public void applaunch(){
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://orangehrm.com/");
        
        
    }
    public void closeapp(){
        driver.quit();
    }
}