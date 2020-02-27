Feature: Fill the form and submit the form


  @Form
  Scenario: User is able to submit the form
    Given The user as accces to the formy Website
    And The user clicks on complete form
    And The webform is displayed
    And the user enters details
    | akira | jonshon| student |
    | joan  | clausio| profess |
    | danie | jonshon| barber  |
    And The user click Submit form
    Then The user should be presented with a thank you message