package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class exitIntent {
    WebDriver driver;

    public exitIntent(BaseClass baseClass)
    {
        this.driver=baseClass.getDriver();
    }

    @When("user trying to exit the screen")
    public void user_trying_to_exit_the_screen(){
     driver.findElement(By.xpath("//a[@href='/exit_intent']")).click();

    }
    @Then("pop up should be shown")
    public void pop_up_should_be_shown() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        Robot robot  = new Robot();
        robot.mouseMove(5000,0);

        Thread.sleep(15000);

    }
}
