package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class webtablessorting {
 WebDriver driver;

 public webtablessorting(BaseClass baseClass){
     this.driver= baseClass.getDriver();

 }

    @When("user trying to get price")
    public void user_trying_to_get_price(){
     driver.findElement(By.xpath("//a[@href='/tables']")).click();
    }
    @Then("print all the price in sorted manner")
    public void print_all_the_price_in_sorted_manner(){
     List<Float>sl= new ArrayList<>();
        List<WebElement>sb= driver.findElements(By.xpath("//td[4]"));
        for(int i=0;i<sb.size();i++){
            String s= sb.get(i).getText().replace("$", "");
            sl.add(Float.parseFloat(s));
        }
        Collections.sort(sl);
        System.out.print(sl);

    }
}
