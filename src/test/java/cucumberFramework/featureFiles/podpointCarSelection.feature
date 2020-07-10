  Feature: PodPoint Checkout

    @Test
    Scenario: User selects a car, connection type, power rating and extras in the checkout section
      Given The user is on the "https://checkout.pod-point.com/"
      When The user select the "Mitsubishi" under the car selection option
      And The user selects the "Outlander" under the car selction option
      And The user ticks the option to optout
      And The user selects "Universal Socket" under the Connection type
      And The user selects "7kW" power rating under the the Power rating section
      And The 6 Compatible extras are displayed
      And The user selects a "random compatible" extra
      Then The total price of the 7kW unit price + the compatible price is displayed
