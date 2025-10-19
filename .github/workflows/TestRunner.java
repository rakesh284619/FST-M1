package activities;

public class TestRunner {

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite // Marks this class as a JUnit Platform test suite.
@IncludeEngines("cucumber") // Specifies that the Cucumber engine should be used to run the tests.
@SelectClasspathResource("Features") // Points to the location of feature files in the classpath (typically a folder named "Features").
@ConfigurationParameter(
  key = Constants.GLUE_PROPERTY_NAME, // Sets the glue code location, which contains step definitions and hooks.
  value = "stepDefinitions") // The package where step definitions are implemented.
@ConfigurationParameter(
  key = Constants.FILTER_TAGS_PROPERTY_NAME, // Filters which scenarios to run based on tags.
  value = "@activity3") // Only scenarios tagged with @activity1 will be executed that are present in feature file.
//value = "@activity1 or @activity2") // this will excute both activities from feature file having the tags individually
//value = "@activity1 and @activity2") // this will excute both activities from feature file having the tags together

@ConfigurationParameter(
	    // Specifies the reporting plugins to be used by Cucumber.
	    key = Constants.PLUGIN_PROPERTY_NAME,
	    
	    // Enables multiple output formats:
	    // - "pretty" for readable console output
	    // - "html" for an HTML report saved in Reports/HTML_Report.html
	    // - "junit" for a JUnit XML report saved in Reports/XML_Report.xml
	    // - "json" for a JSON report saved in Reports/JSON_Report.json
	    value = "pretty, html:Reports/HTML_Report.html, junit:Reports/XML_Report.xml, json:Reports/JSON_Report.json"
	)

	@ConfigurationParameter(
	    // Enables publishing of the test report to Cucumber's reporting service.
	    key = Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME,
	    
	    // Set to "true" to allow automatic publishing of reports online.
	    value = "true"
	)
