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
        
        //Get to bottom of page
        ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
                        
        
////        //wait for page to load
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        
////        //Select checkboxes
////        List<WebElement>checkbox = driver.findElements(By.xpath("//input[@region='North America' and @name='checkAll']"));     
////        System.out.println("checkbox.size():" + checkbox.size());
//
//        driver.findElement(By.xpath("//html//tr[26]/td[2]/input[1]")).click();
//        driver.findElement(By.xpath("//html//tr[27]/td[2]/input[1]")).click();
//        driver.findElement(By.xpath("//html//tr[28]/td[2]/input[1]")).click();
//        driver.findElement(By.xpath("//html//tr[29]/td[2]/input[1]")).click();
//        driver.findElement(By.xpath("//html//tr[30]/td[2]/input[1]")).click();
//        driver.findElement(By.xpath("//html//tr[31]/td[2]/input[1]")).click();
//        driver.findElement(By.xpath("//html//tr[32]/td[2]/input[1]")).click();
//        driver.findElement(By.xpath("//span[@class='icon']")).click();
        
        
        //Exam 2
//        driver.findElement(By.xpath("//html//form[@id='userform']/table[@width='100%']//input[2]")).click();
//        driver.findElement(By.xpath("//a[@id='continueID']")).click();
        
        //Exam 3
//        driver.findElement(By.xpath("//a[@id='continueID']")).click();
        
        
        
//        //Exam 4
//        //wait for page to load
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //Get to middle of page
//        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
//        //Click checkboxes
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//td[1]/div[1]/ul[1]/li[1]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//td[2]/div[1]/ul[1]/li[1]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//td[1]/div[1]/ul[1]/li[2]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//td[2]/div[1]/ul[1]/li[2]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//td[1]/div[2]/ul[1]/li[1]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[3]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[2]/ul[1]/li[2]/span[1]/input[1]")).click();
//        
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[4]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[@class='col_left']//li[3]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[5]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[@class='col_left']//li[4]/span[1]/input[1]")).click();
//                driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[@class='col_left']//li[5]/span[1]/input[1]")).click();
//                driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[@class='col_left']//li[6]/span[1]/input[1]")).click();
//                
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[1]/span[1]/input[1]")).click();//AMEX (Network B/CTA)
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[3]/span[1]/input[1]")).click();
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[4]/span[1]/input[1]")).click();
//               
//                
//                
//                
//                
//                driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[6]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[7]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[8]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[9]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[10]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[11]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[12]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[13]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//div[1]/ul[1]/li[14]/span[1]/input[1]")).click();
//            //Scroll Down Page
//            ((JavascriptExecutor)driver).executeScript("scroll(0,550)");
//            //wait for page to load
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[5]/span[1]/input[1]")).click();//Mexican Stock Exchange
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[6]/span[1]/input[1]")).click(); 
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[7]/span[1]/input[1]")).click();
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[8]/span[1]/input[1]")).click(); 
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[10]/span[1]/input[1]")).click();
//                    driver.findElement(By.xpath("//html//td[1]/div[3]/ul[1]/li[11]/span[1]/input[1]")).click(); 
//                    
//                    
//                    
//                    driver.findElement(By.xpath("//html//div[4]/ul[1]/li[1]/span[1]/input[1]")).click(); //Fixed Income
//                    driver.findElement(By.xpath("//html//div[4]/ul[1]/li[2]/span[1]/input[1]")).click(); //Fixed Income
//                    
//                driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[15]/span[1]/input[1]")).click();
//                driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[16]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[17]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[18]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[19]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[20]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[21]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[22]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[23]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[24]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//div[@id='tabs-1']//li[25]/span[1]/input[1]")).click();
//                    driver.findElement(By.xpath("//html//div[@id='tabs-1']//td[2]/div[2]/ul[1]/li[1]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//td[2]/div[3]/ul[1]/li[1]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//td[2]/div[3]/ul[1]/li[2]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//td[2]/div[3]/ul[1]/li[3]/span[1]/input[1]")).click();
//        driver.findElement(By.xpath("//html//td[2]/div[3]/ul[1]/li[4]/span[1]/input[1]")).click();
//                        driver.findElement(By.xpath("//a[@id='continueID']")).click();//Continue Button


    }
    
}






























