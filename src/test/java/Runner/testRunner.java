package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

        //path of feature file
        features = "src/test/java/Features",
        //features = "src/test/java/Features/KYC_APIS",
        //path of step definition file
        glue = {"stepDefinitions","Utility"},
      //  tags = "@p",
        plugin = { "pretty","html:target/reports/test2.html" },
        monochrome = true

)


public class testRunner extends AbstractTestNGCucumberTests {
}

