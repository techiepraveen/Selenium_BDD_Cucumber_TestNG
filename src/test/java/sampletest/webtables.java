package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class webtables {
    WebDriver driver= new ChromeDriver();

   @Test
    public void webtables(){
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();
        List<Float>sl= new ArrayList<>();
       List<WebElement> web= driver.findElements(By.xpath("//td[4]"));
       for(int i=0;i<web.size();i++){
           String s= web.get(i).getText().replace("$","");
           sl.add(Float.parseFloat(s));



       }
       Collections.sort(sl);
       System.out.println(sl);
    }
}
