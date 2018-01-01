
package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)

// running test using  TestNG and creating report in Json and HTML format
@CucumberOptions(features = {"src/test/java/Future"},format={"json:target/cucumber.json","html:target/cucumber-pretty"},glue = "Steps")

public class TestRunner extends AbstractTestNGCucumberTests {

}
