package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/cucumber/Features"},
        glue = {"definitions"},
        plugin = {"pretty", "json:target/json/cucumber-json-report.json"})

@Test
public class testngTest extends AbstractTestNGCucumberTests {

}