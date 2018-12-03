package co.com.gmail.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/GmailLogin.feature",
glue = "co.com.gmail.stepDefinitions",
snippets = SnippetType.CAMELCASE)
public class GmailLoginRunner {}
