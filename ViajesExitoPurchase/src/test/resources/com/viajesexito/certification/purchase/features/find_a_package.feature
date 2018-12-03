#Author: esneider.m97@gmail.com
@tag
Feature: Search for a travel package
  in the page www.viajesexito.com

Background:
Given that Dann wants to buy a tourist package

	Scenario: Do a search of a turistic package
    When Dann fill the fields of the search package
    |Origen|Destino|Ida|Regreso|
    |Medellín|Bogota|25-01-2019|10-02-2019|
    Then Dann should see a list of packages

