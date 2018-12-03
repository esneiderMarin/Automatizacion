$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/viajesexito/certification/purchase/features/find_a_package.feature");
formatter.feature({
  "name": "Search for a travel package",
  "description": "  in the page www.viajesexito.com",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Dann wants to buy a tourist package",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsFindAPackage.thatDannWantsToBuyATouristPackage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Do a search of a turistic package",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "Dann fill the fields of the search package",
  "rows": [
    {
      "cells": [
        "Origen",
        "Destino",
        "Ida",
        "Regreso"
      ]
    },
    {
      "cells": [
        "Medell�n",
        "Bogota",
        "25-01-2019",
        "10-02-2019"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsFindAPackage.dannFillTheFieldsOfTheSearchPackage(String\u003e\u003e)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.viajesexito.certification.purchase.tasks.SearchPackage.performAs(SearchPackage.java:35)\r\n\tat com.viajesexito.certification.purchase.tasks.SearchPackage$$EnhancerByCGLIB$$51900417.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.viajesexito.certification.purchase.tasks.SearchPackage$$EnhancerByCGLIB$$51900417$$FastClassByCGLIB$$1fcc516a.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.BaseMethodRunner.invokeMethod(BaseMethodRunner.java:10)\r\n\tat net.thucydides.core.steps.NormalMethodRunner.invokeMethodAndNotifyFailures(NormalMethodRunner.java:20)\r\n\tat net.thucydides.core.steps.StepInterceptor.runNormalMethod(StepInterceptor.java:361)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:132)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.viajesexito.certification.purchase.tasks.SearchPackage$$EnhancerByCGLIB$$51900417.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:106)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:90)\r\n\tat com.viajesexito.certification.purchase.stepdefinitions.StepDefinitionsFindAPackage.dannFillTheFieldsOfTheSearchPackage(StepDefinitionsFindAPackage.java:54)\r\n\tat ✽.Dann fill the fields of the search package(src/test/resources/com/viajesexito/certification/purchase/features/find_a_package.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Dann should see a list of packages",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsFindAPackage.dannShouldSeeAListOfPackages()"
});
formatter.result({
  "status": "skipped"
});
});