package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinitionfile","hooks"},
        plugin = {"pretty",
                "html:target/testresult/HtmlReport.html",
                "json:target/testresult/JsonReport.json",
                "junit:target/testresult/HtmlReport.xml"},
        tags = "@lmti03"
)
public class FeatureRunner {
}
