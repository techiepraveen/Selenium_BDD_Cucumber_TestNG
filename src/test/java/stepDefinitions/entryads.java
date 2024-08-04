package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class entryads {
    WebDriver driver;
    public entryads(BaseClass baseClass)
    {
        this.driver=baseClass.getDriver();
    }

    @When("user is trying to close the ads")
    public void user_is_trying_to_close_the_ads(){
    driver.findElement(By.xpath("//a[@href='/entry_ad']")).click();
    }
    @Then("ad should gets close")
    public void ad_should_gets_close() throws InterruptedException {
        Thread.sleep(5000);

   WebElement modal= driver.findElement(By.xpath("//div[@class='modal']"));
   if(modal.isDisplayed()){
       System.out.println("TEXT are: "+ driver.findElement(By.xpath("//div[@class='modal-body']")).getText());
       driver.findElement(By.xpath("//div[@class='modal-footer']")).click();
       Thread.sleep(5000);
   }
   else {
       System.out.println("modal not found");
   }


    }
}
