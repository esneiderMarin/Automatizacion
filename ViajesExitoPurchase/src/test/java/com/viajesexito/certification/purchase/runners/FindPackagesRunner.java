package com.viajesexito.certification.purchase.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/viajesexito/certification/purchase/features/find_a_package.feature", 
glue="com.viajesexito.certification.purchase.stepdefinitions",
snippets = SnippetType.CAMELCASE,
plugin=  {"pretty","json:target/json-report/LoginReport.json",
	"html:target/cucumber-reports"}
)
public class FindPackagesRunner {

}
