/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter_selenium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 *
 * @author greg_mbp
 */
public class Twitter_selenium {

    /**
     * @param args the command line arguments
     */
    private static String url = "https://www.twitter.com";
    
    private static WebDriver driver = null;
    
    private static void f_tweet(String un, String pw){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
             
        System.out.println(timeStamp);
        
        System.setProperty("webdriver.gecko.driver", "/usr/local/Cellar/Selenium/Mozilla_Driver/geckodriver");
        driver = new FirefoxDriver();
        
        //Go to twitter.com
        driver.get(url);
        
        //Wait for page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Click Login Button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[2]")).click();
        
        //Login
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")).sendKeys(un);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/input[1]")).sendKeys(pw);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
        
        //Tweet
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/div[2]/div[1]")).sendKeys("TimeStamp: " + timeStamp);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[1]/span[1]")).click();
        
        //Delete Tweet
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[4]/div[2]/ol[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/span[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[4]/div[2]/ol[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/button[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[33]/div[1]/div[2]/div[4]/button[2]")).click();
    }
    
    public static void main(String[] args) {
        String un = "";
        String pw = "";
        f_tweet(un,pw);
       
    }
    
}
