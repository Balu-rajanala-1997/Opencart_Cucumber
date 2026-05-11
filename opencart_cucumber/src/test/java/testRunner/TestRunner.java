package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					
					//features = {".//Features/"},  // all the features files
					//features = {".//Features/Login.feature"},  // single feature file
				    //features = {".//Features/Registration.feature"},
					//features = {".//Features/LoginDDTExcel.feature"},  // single feature file 
					features = {".//Features/Login.feature", ".//Features/Registration.feature"},  // Multiple(specific) features files
					//features = {"@target/rerun.txt"},  //only failure scenarios
					glue={"stepDefinitions","hooks"},
					plugin= {
								"pretty", "html:reports/myReport.html",   // key and value for cucumber report
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",  // extent report
								"rerun:target/rerun.txt",
							},
					dryRun=false,  // checks mapping between scenario steps(features file) and step definition methods
					monochrome=true,  // to avoid junk characters in output
					publish=true  // to publish report in cucumber server
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression"  //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression"  //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanith or @regression"  //Scenarios tagged with either @sanity or @regression
		
		)
public class TestRunner {
	
}
