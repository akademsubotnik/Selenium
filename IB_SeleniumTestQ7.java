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
        
        
//        //Exam 7
//        //Assert that text Day Trading Risk Disclosure Statement exists on the page
//        String text = "Day Trading Risk Disclosure Statement";
//        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
//        Assert.assertTrue("Text not found!", list.size() > 0);
//                //1st agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3071']")).click();
//            driver.findElement(By.xpath("//html//tr[9]/td[1]/div[1]/span[1]")).click();        
//                //2nd agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3070']")).click();
//            driver.findElement(By.xpath("//html//tr[15]/td[1]/div[1]/span[1]")).click();
//                //3rd agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,1600)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4098']")).click();
//            driver.findElement(By.xpath("//html//tr[21]/td[1]/div[1]/span[1]")).click();
//                //4th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4154']")).click();
//            driver.findElement(By.xpath("//html//tr[27]/td[1]/div[1]/span[1]")).click();
//                  //5th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,2400)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4002']")).click();
//            driver.findElement(By.xpath("//html//tr[33]/td[1]/div[1]/span[1]")).click(); 
//                //6th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,2800)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4013']")).click();
//            driver.findElement(By.xpath("//html//tr[39]/td[1]/div[1]/span[1]")).click();            
//                //7th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,3200)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4003']")).click();
//            driver.findElement(By.xpath("//html//tr[45]/td[1]/div[1]/span[1]")).click();            
//                //8th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,3600)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3024']")).click();
//            driver.findElement(By.xpath("//html//tr[51]/td[1]/div[1]/span[1]")).click();            
//                //9th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3077']")).click();
//            driver.findElement(By.xpath("//html//tr[57]/td[1]/div[1]/span[1]")).click();            
//                //10th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,4400)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3076']")).click();
//            driver.findElement(By.xpath("//html//tr[63]/td[1]/div[1]/span[1]")).click();            
//                //11th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,4800)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3230']")).click();
//            driver.findElement(By.xpath("//html//tr[69]/td[1]/div[1]/span[1]")).click();            
//                //12th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,5200)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3074']")).click();
//            driver.findElement(By.xpath("//html//tr[75]/td[1]/div[1]/span[1]")).click();            
//                //13th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,5600)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4070']")).click();
//            driver.findElement(By.xpath("//html//tr[81]/td[1]/div[1]/span[1]")).click();            
//                //14th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3073']")).click();
//            driver.findElement(By.xpath("//html//tr[87]/td[1]/div[1]/span[1]")).click();            
//                //15th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,6400)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final2192']")).click();
//            driver.findElement(By.xpath("//html//tr[93]/td[1]/div[1]/span[1]")).click();            
//                //16th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,6800)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final9130']")).click();
//            driver.findElement(By.xpath("//html//tr[99]/td[1]/div[1]/span[1]")).click();            
//                //17th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,7200)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final3104']")).click();
//            driver.findElement(By.xpath("//html//tr[105]/td[1]/div[1]/span[1]")).click();            
//                //18th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,7600)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4016']")).click();
//            driver.findElement(By.xpath("//html//tr[111]/td[1]/div[1]/span[1]")).click();            
//                //19th agreement
//            //Page down to get to the first agreement
//            ((JavascriptExecutor)driver).executeScript("scroll(0,8000)");
//            //Click agree and accept click accept on first agreement
//            driver.findElement(By.xpath("//input[@id='final4019']")).click();
//            driver.findElement(By.xpath("//html//tr[117]/td[1]/div[1]/span[1]")).click();            
//                //E-Signature
//            //Page down to get to e-signature
//            ((JavascriptExecutor)driver).executeScript("scroll(0,8400)");
//                //Pass in text to signature field signature = Test Test
//                    //Type password into password field
//            driver.findElement(By.xpath("//input[@id='signature0']")).sendKeys("Test Test");
//            //Click button to continue
//            driver.findElement(By.xpath("//a[@id='continueID']")).click();

    

    }
    
}






























