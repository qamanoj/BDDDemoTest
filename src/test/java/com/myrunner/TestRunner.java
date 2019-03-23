package com.myrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile",
				glue={"com.mystepdefinition"},
				format={"pretty","html:test-output/html.xml","json:test-output/json.xml","junit:test-output/junit.xml"},
				strict=true,
				monochrome=true,
				dryRun=false,
				tags={"@smoketest","@regrationtest"}
				)

public class TestRunner {

}
