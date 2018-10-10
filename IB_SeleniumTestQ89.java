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
        
        
//        //Exam 8
//            //Go to lower half of page
//            ((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
//            //Create JavascriptExecutor
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            //Locate element(agree radio button) on page
//            WebElement element = driver.findElement(By.xpath("//html//table[1]/tbody[1]/tr[1]/td[1]/input[1]"));
//            //Scroll to where the element is on the page
//            js.executeScript("arguments[0].scrollIntoView(true);", element);            
//            //Click agree to 1st agreement
//            driver.findElement(By.xpath("//html//table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();
//            //Click agree to 2nd agreement
//            driver.findElement(By.xpath("//html//table[2]/tbody[1]/tr[1]/td[1]/input[1]")).click();            
//            //Page down to bottom of page
//            ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
//            //Fill out signature field
//            driver.findElement(By.xpath("//input[@id='signature0']")).sendKeys("Test Test");
//            //Click continue button
//            driver.findElement(By.xpath("//a[@id='continueID']")).click();
//        //Exam 9
//            //Page down to middle of page where you will provide signature
//            ((JavascriptExecutor)driver).executeScript("scroll(0,3000)");        
//            //Enter e-signature into e-signature field
//            driver.findElement(By.xpath("//td[@colspan='3']//input[@type='text']")).sendKeys("Test Test");
//            //Enter name in Print Name field
////            driver.findElement(By.xpath("//html//tr[14]/td[2]/input[1]")).sendKeys("Gregory Smith");
//            //Page down to bottom of page
//            ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");   
//            //Click continue button
//            driver.findElement(By.xpath("//a[@id='continueID']")).click();
            
            

    }
    
}






























