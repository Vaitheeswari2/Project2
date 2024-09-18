package com.omrbranch.reporting;

import com.omrbranch.baseclass.BaseClass;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Reporting extends BaseClass{
	public static void generateReports (String json) throws IOException, IOException {
        File file = new File ((getProjectPath () + getPropertyValue ("reportPath")));
        Configuration configuration = new Configuration (file, "Grocery with API Automation ");
        configuration.addClassifications ("Browser", "Chrome");
        configuration.addClassifications ("OS", "WIN 10");
        configuration.addClassifications ("Name", "Vaitheeswari");
        configuration.addClassifications ("Batch", "API 2 Pm");
        configuration.addClassifications ("Trainer", "Priya");
        List <String> jsonFiles = new ArrayList <> ();
        jsonFiles.add (json);
        ReportBuilder builder = new ReportBuilder (jsonFiles, configuration);
        builder.generateReports ();
    }
	
}
