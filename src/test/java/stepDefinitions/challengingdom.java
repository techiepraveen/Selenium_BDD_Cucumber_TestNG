package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class challengingdom {

    WebDriver driver;
    public challengingdom(BaseClass baseClass){
        this.driver= baseClass.getDriver();
    }

    @When("user trying to get data from webtables")
    public void user_trying_to_get_data_from_webtables(){
    driver.findElement(By.xpath("//a[@href='/challenging_dom']")).click();


    }
    @Then("user should be able to get data")
    public void user_should_be_able_to_get_data(){
     List<WebElement> wt=driver.findElements(By.xpath("//td[4]"));
     for(int i=0;i<wt.size();i++){
         System.out.println(wt.get(i).getText());
     }
    }
}
