#Author: esneider.m97@gmail.com

Feature: Google translate
	As a web user
	I want to use google translate
	to translate words between different languages

  Scenario: Translate from english to spanish
    Given that Susan want to translate a word
    When she translates the word chesse to spanish
    Then she should see the word queso in the screen

