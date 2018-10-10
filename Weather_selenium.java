/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather_selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author greg_mbp
 */
public class Weather_selenium {

    /**
     * @param args the command line arguments
     */
    
    private static String url = "https://www.darksky.net";
    
    private static WebDriver driver = null;
    

    private static final String[] cities = {"armonk,ny", "tampa,florida"};
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.gecko.driver", "/usr/local/Cellar/Selenium/Mozilla_Driver/geckodriver");
        driver = new FirefoxDriver();
        
        //Go to twitter.com
        driver.get(url);
        
        //Wait for page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Weather_selenium weather = new Weather_selenium();
        for(int i = 0; i < cities.length; i++){
            weather.returnweather(cities[i]);
        }

    }
    
    String returnweather(String location){
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/input[1]")).sendKeys(location);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/a[2]")).click();
        
        String low_temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/a[1]/span[2]/span[1]")).getText();
        String high_temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/a[1]/span[2]/span[3]")).getText();
        
        String print_string = location + "\t" + "Low:" +low_temp + "\t" + "High:" + high_temp + "\n\n";
        
        System.out.println(print_string);
        
        return print_string;
    }
    
}
