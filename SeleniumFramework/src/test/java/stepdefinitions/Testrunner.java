package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\WebUITesting\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\Features\\Test.feature",glue = "stepdefinitions")
public class Testrunner {

}
