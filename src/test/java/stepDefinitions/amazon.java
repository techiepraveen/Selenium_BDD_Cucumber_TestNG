package stepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class amazon {
    WebDriver driver;
    public amazon(BaseClass baseClass){
        this.driver=baseClass.getDriver();

    }
    List<Long> sorted_list= new ArrayList<>();

    @When("user trying to fetch prices of all the shirts")
    public void user_trying_to_fetch_prices_of_all_the_shirts(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

    }
    @Then("price should be shown in ascending order")
    public void price_should_be_shown_in_ascending_order() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
      List<WebElement> shirt_price= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        System.out.println(shirt_price.size());
      for(int i=0;i<shirt_price.size();i++){
          System.out.println(shirt_price.get(i).getText());
       //   String s= shirt_price.get(i).getText().replace("$","");
           String s= shirt_price.get(i).getText().replace(",","");
          System.out.println(s);
         sorted_list.add(Long.parseLong(s));
      }


        Collections.sort(sorted_list);
        for(int i=0;i<sorted_list.size();i++){
            System.out.println(sorted_list);
        }
    }


}
