package stepDefinitions;




import Utility.BaseClass;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class dropdown {
    WebDriver driver;








      @Given("user is on the website")
      public void user_is_on_the_website(){

          System.out.println(driver.getCurrentUrl());

    }

        @When("user trying to choose any option from drop down")
        public void user_trying_to_choose_any_option_from_drop_down(){
     driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

          System.out.println(driver.getCurrentUrl());

    }

     @Then("user should be able to choose one option")
     public void user_should_be_able_to_choose_one_option() throws InterruptedException {
       Select sl = new Select(driver.findElement(By.id("dropdown")));

      sl.selectByValue("2");
      Thread.sleep(5000);

    }
}
