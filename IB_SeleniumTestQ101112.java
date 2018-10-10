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
import org.junit.Assert;

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
        
        
//        //Exam 10
//            //Page down to middle of page
//            ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
//            //Enter e-signature into e-signature field
//            driver.findElement(By.xpath("//input[@id='signatures0']")).sendKeys("Test Test");
//            //Enter name into name of person signing for subscriber
//            driver.findElement(By.xpath("//input[@id='agentName']")).sendKeys("Gregory Smith");
//            //Enter title into title of person signing for subscriber
//            driver.findElement(By.xpath("//input[@id='agentTitle']")).sendKeys("Mr.");
//            //Page down to bottom of page
//            ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
//            //Enter name into By: Subscriber field
//            driver.findElement(By.xpath("//input[@id='bysignatures0']")).sendKeys("Test Test");
//            //Click continue button
//            driver.findElement(By.xpath("//a[@id='continueID']")).click();
            
//        //Exam 11
//        //Click No to question: Do you have an existing Market Data Agreement with the NYSE (or AMEX/ARCA)?
//        driver.findElement(By.xpath("//html//table[@width='100%']//table[@width='100%']//input[2]")).click();
//        //Page down to get to agree radio button for NYSE Professional Subscriber Agreement
//        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
//        //Click agree radio button
//        driver.findElement(By.xpath("//input[@id='final3035']")).click();
//        //Enter e-signature Test Test into e-signature field
//        driver.findElement(By.xpath("//input[@id='signature0']")).sendKeys("Test Test");
//        //Click continue button
//        driver.findElement(By.xpath("//a[@id='continueID']")).click();
    
        //Exam 12
        //Page down to bottom of page
        ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
        //Click do not activate Activate Online Security Card button
        driver.findElement(By.xpath("//a[@id='activateNID']")).click();
        





           
    }
    
}






























