package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class contextMenu {
    WebDriver driver;

    public contextMenu(BaseClass baseClass){
        this.driver= baseClass.getDriver();
    }

    @When("user clicking on context menu")
    public void user_clicking_on_context_menu(){
        driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
    }
    @Then("alert should be shown")
    public void alert_should_be_shown() throws InterruptedException {
        WebElement target= driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions = new Actions(driver);
        actions.contextClick(target).perform();
        Thread.sleep(5000);
    }
}
