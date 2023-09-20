#language:en

Feature:
  As a QA Engineer
  I want to check the Performance of Facebook Login page
  So that I can check the automation working


  #PERFORMANCE
  # [access Facebook login page]
  Scenario: Check if time response is under 3000ms
    Then time response is under 3000ms
