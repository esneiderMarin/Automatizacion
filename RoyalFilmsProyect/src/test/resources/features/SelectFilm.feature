#Author: your.email@your.domain.com
@tag
Feature: Select film in Royal Films
	As a web user
	I want to select a film that i am interested in
	to see more details
	
	
  @tag1
  Scenario: Select a film
    Given that jhon searched for a film
    When he clicks on a result
		Then he checks the description
