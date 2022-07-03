package StepDefinitions.CareTakerStepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/CaretakerFeatures",glue= {"StepDefinitions/CareTakerStepDefinitions"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports/CareTaker/CaretakerReport.html",
        "json:target/JSONReports/CareTaker/CaretakerReport.json",
        "junit:target/JUnitReports/CareTaker/CaretakerReport.xml"}


)


public class CareTakerTestRunner {

}
