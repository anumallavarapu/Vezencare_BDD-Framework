package StepDefinitions.HospitalStepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/HospitalFeatures",glue= {"StepDefinitions/HospitalStepDefinitions"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports/Hospital/HospitalReport.html",
        "json:target/JSONReports/Hospital/Hospitalreport.json",
        "junit:target/JUnitReports/Hospital/Hospitalreport.xml"},
tags = "@HosMandatory"

)
public class HospitalTestRunner {
	

}
