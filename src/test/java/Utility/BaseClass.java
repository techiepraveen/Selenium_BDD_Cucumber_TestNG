package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BaseClass {

   public static WebDriver driver;


   public WebDriver getDriver()
   {
       return driver;
   }
    @Before
    public void browserOpen(){
        System.out.println("browser open");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    public void click_by_xpath(String xpath)
    {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void click_by_wait(String xpath_for_wait)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_for_wait)));
    }
    @After
    public void quitBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
