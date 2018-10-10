/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ib_seleniumtest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author greg_mbp
 */
public class IB_SeleniumTest {

    public static String IB_SeleniumTest_url = "https://gdcdyn.interactivebrokers.com/sso/Login";
    public static String IB_username = "testje136";
    public static String IB_password = "tester12";
    
    private static WebDriver driver = null;
    
    public static void main(String[] args) {
        //Setting Driver Properties
        System.setProperty("webdriver.gecko.driver", "/usr/local/Cellar/Selenium/Mozilla_Driver/geckodriver");
        driver = new FirefoxDriver();    
        
        //wait for page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Go to mail.google.com
        driver.get(IB_SeleniumTest_url);
        
        //Type username into username field
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys(IB_username);
        
        //Type password into password field
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(IB_password);
        
        driver.findElement(By.xpath("//*[@id=\"submitForm\"]")).click();
        
        //wait for page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        //Exam 5
//        //Click radio button in table 1
//        driver.findElement(By.xpath("//html//table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[1]/input[1]")).click();
////        //Get to middle of page
//        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
////        //wait for page to load
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//html//table[2]/tbody[1]/tr[3]/td[1]/div[1]/span[1]/input[1]")).click();
//        //Click continue button
//        driver.findElement(By.xpath("//a[@id='continueID']")).click();

//        //Exam 6
//        //Go to bottom of page
//        ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
//        //wait for page to load
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        //Click continue button
//        driver.findElement(By.xpath("//a[@id='continueID']")).click();



    }
    
}






























