package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class multipleWindow {
    WebDriver driver;
   public multipleWindow(BaseClass baseClass){
        this.driver=baseClass.getDriver();
    }


    @When("user trying to click on multiple window")
    public void user_trying_to_click_on_multiple_window(){
    driver.findElement(By.xpath("//a[@href='/windows']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/windows/new']")));
    driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
    }
    @Then("verify new window is getting open")
    public void verify_new_window_is_getting_open(){
        String parent= driver.getWindowHandle();
        Set<String> window=  driver.getWindowHandles();

        Iterator<String>it = window.iterator();
       while(it.hasNext()){
           String child_window= it.next();
           if(!parent.equals(child_window)){
               driver.switchTo().window(child_window);
           }
       }
      driver.getCurrentUrl();
    }
    @Then("close new window")
    public void close_new_window(){
  driver.close();
    }
}
