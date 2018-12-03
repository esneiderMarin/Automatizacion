Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given That I am in gmail
    When I enter my <user> and <key>
    Then So when I login I should see <message> in the screen

    Examples: 
      | user              | key          | message   |
      | esneider.selenium | 1234567890S_ | Principal |
      | name2             | 1234567890S_ | Principal |
      | esneider.selenium |    123456789 | Principal |
      | name2             |   1234567890 | Principal |
