package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class geolocation {
WebDriver driver;

    public geolocation(BaseClass baseClass)
    {
        this.driver=baseClass.getDriver();
    }

    @When("user clicks on enabling the notification")
    public void user_clicks_on_enabling_the_notification(){
        driver.findElement(By.xpath("//a[@href='/geolocation']")).click();
    }
    @Then("notification should be shown and clickable")
    public void notification_should_be_shown_and_clickable() throws InterruptedException {
    driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    }
}
