package StepDefinitions.MemberStepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/MemberFeatures",glue= {"StepDefinitions/MemberStepDefinitions"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports/Member/MemberReport.html",
        "json:target/JSONReports/Member/MemberReport.json",
        "junit:target/JUnitReports/Member/MemberReport.xml"}

)
public class MemberTestRunner {

}
