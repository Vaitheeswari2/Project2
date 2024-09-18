package com.omrbranch.runner;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.reporting.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith (Cucumber.class)
@CucumberOptions (plugin = "json:target/omrapi.json", features = "src/test/resources/features", glue = "com/omrbranch/stepdefinition", tags = "")
public class TestRunner extends BaseClass {
    @AfterClass
    public static void generateReport () throws IOException {
        Reporting.generateReports (getProjectPath () + getPropertyValue ("jsonPath"));
    }
	

}
