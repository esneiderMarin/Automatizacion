#Author: juliangebe@gmail.com

@tag
Feature: Buscar en google
  Yo quiero usar google para buscar una cadena 

  @tag1
  Scenario: Busqueda exitosa
    Given Que puedo abrir el navegador   
    When Voy a google 
    And realizo una busqueda   
    Then valido que el resultado sea el esperado
    


