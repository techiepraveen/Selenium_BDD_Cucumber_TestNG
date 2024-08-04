package stepDefinitions;


import Utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alert {
    WebDriver driver;

    public alert(BaseClass baseClass){
        this.driver=baseClass.getDriver();

    }

    @When("user trying to accept alert")
    public void user_trying_to_accept_alert(){
    driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();
    }
    @Then("alert should be working fine")
    public void alert_should_be_working_fine() throws InterruptedException {
    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
    Thread.sleep(3000);
    driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Praveen");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();



    }
}
