#language:en

Feature:
  As a QA Engineer
  I want to check the Security of Facebook Login page
  So that I can check the automation working

#SECURITY
  # [access Facebook login page]
  Scenario: Check URL starts with HTTPS
    Then the URL starts with HTTPS

  Scenario: Should handle with brute force attack
    Then handle with brute force attack

  Scenario: Should handle with malicious script
    Then handle with malicious script

  Scenario: Should handle with malicious image
    Then handle with malicious image

  Scenario: Should handle with malicious reflected XSS
    Then handle with malicious script reflected XSS