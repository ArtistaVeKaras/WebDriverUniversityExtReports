Feature: User access Utilita Help Page

  @Utilita
  Scenario: User submits form via HelpPage
Given The website "https://utilita.co.uk/" has loaded
When user clicks on Help button
Then Help screen (https://utilita.co.uk/help) will load
And  The user clicks Manage your install
Then Manage your install screen will loads
And  The user clicks ‘Installation’
Then The installing your Smart Meter screen will show
And The user selects ‘Send us an email’
Then Manage your install drop down will open
And The user clicks ‘Have a question about your install?’
Then The contact form will load
And The user chooses ‘A question about my install’ from the ‘How can we help’ field
And No other details are filled out
And The user clicks Submit button
Then Error message "This field is required" will show below the field Title
And Error message "This field is required" will show below the field First name
And Error message "This field is required" will show below the field Last name
And Error message "This field is required" will show below the field Address
And Error message "This field is required" will show below the field Your question
And Error message "This field is required" will show below the field Preferred contact method

