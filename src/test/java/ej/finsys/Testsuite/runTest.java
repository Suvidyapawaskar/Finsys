package ej.finsys.Testsuite;

import org.junit.runner.RunWith; 

import cucumber.api.CucumberOptions;


//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber","html:target/htmlreports"},
features = {"src/test/resources/FeatureCollections"},
glue={"ej.finsys.steps"},
tags={"@SmokeTest"}
)
public class runTest {
}
/*
@RunWith(Cucumber.class) 
@CucumberOptions.Options(format = {"pretty", "html:target/html"},
features = {"FeatureCollections"},
tags={"@SmokeTest"}
	) 
public class runTest {

}
*/