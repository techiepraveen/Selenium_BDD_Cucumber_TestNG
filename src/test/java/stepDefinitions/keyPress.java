package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class keyPress {

    WebDriver driver;
    public keyPress(BaseClass baseClass){
        this.driver=baseClass.getDriver();
    }

    @When("user trying to press any key from the keyboard")
    public void user_trying_to_press_any_key_from_the_keyboard(){
     driver.findElement(By.xpath("//a[@href='/key_presses']")).click();
    }
    @Then("it should be dispalyed on the screen")
    public void it_should_be_dispalyed_on_the_screen() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ARROW_LEFT);
   Thread.sleep(50000);
    }
}
