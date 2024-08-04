package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hover {

WebDriver driver;

public hover(BaseClass baseClass){
    this.driver= baseClass.getDriver();
}

    @When("user trying to hover on the element")
    public void user_trying_to_hover_on_the_element(){
       driver.findElement(By.xpath("//a[@href='/hovers']")).click();
    }
    @Then("user should be able to hover on the element")
    public void user_should_be_able_to_hover_on_the_element() throws InterruptedException {
        Thread.sleep(5000);
        WebElement hover= driver.findElement(By.xpath("//div[@class='figure'][2]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(hover).perform();
        Thread.sleep(5000);
    }
}
