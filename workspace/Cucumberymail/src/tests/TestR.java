package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		features = "src/feature",
		glue={"src/stepdefinition"}
		)

public class TestR {
	

}
