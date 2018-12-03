#Author: esneider.m97@gmail.com

Feature: Google search
	As a web user
	I want to use google home page
	to search for a word

  Scenario: Search for a required word
    Given that Esneider want to search a word
    When he find for the word hola mundo
    Then he should see the word Hola mundo in the screen

