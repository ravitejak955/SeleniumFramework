package com.selenium;

import org.testng.annotations.Test;
public class LaunchTest extends BaseClass{
    @Test
     public void launchBrowser() throws InterruptedException{
        applaunch();
        
        System.out.println("Page Title: "+driver.getTitle());
        Thread.sleep(10000);
        closeapp();
        
    }
}
