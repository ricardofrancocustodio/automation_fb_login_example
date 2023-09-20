#language:en

Feature:
  As a QA Engineer
  I want to access Facebook page
  So that I can check the automation working


  Scenario: TC1 - Access Facebook login page
    Then the Facebook page is reached out


  # [access Facebook login page - username input]
  Scenario: TC1.1 - should handle valid email format
    When filled out the username with valid email
    And clicked on the LogIn button
    Then the message of missing password is reached out


# [access Facebook login page - username input]
  Scenario: TC1.2 - should handle invalid email format
    When filled out the username with invalid email format
    And clicked on the LogIn button
    Then the message of invalid email format is displayed


  # [access Facebook login page - username input]
  Scenario: TC1.3 - should handle number format
    When filled out the username with valid phone number
    And clicked on the LogIn button
    Then the message of missing password is reached out


  # [access Facebook login page - username input]
  Scenario: TC1.4 - should handle number format
    When filled out the username with valid phone number
    And clicked on the LogIn button
    Then the message of missing password is reached out


  # [access Facebook login page - username input]
  Scenario: TC1.5 - should handle alphanumeric combination
    When filled out the username with alphanumeric chars
    Then the message of alphanumeric combination is not allowed is reached out


  # [access Facebook login page - username input]
  Scenario: TC1.6 - should handle special chars
    When filled out the username with special chars
    Then the message of special chars is not allowed is reached out


  # [access Facebook login page - password input]
  Scenario: TC1.7 - should be displayed in password format
    When filled out the username with valid email
    And filled out the password with chars
    And tried to read the chars of that field
    Then the message of NoSuchElementException is reached out


  # [access Facebook login page - 'login' button]
  Scenario: TC1.8 - login button should be displayed and enabled
    When found the Login button on the screen
    Then the button is displayed


  # [access Facebook login page - 'Forgot password' link]
  Scenario: TC1.9 - forgot password link should be displayed
    When found the forgot password link on the screen
    Then the Forgot Password link is enabled


  # [access Facebook login page - 'Create new account' button]
  Scenario: TC1.10 - 'create new account' button should be displayed and enabled
    When found the Create new account button on the screen
    Then the button is displayed

  # [access Facebook login page - 'Create a Page' link]
  Scenario: TC1.11 - 'create a page' link should be
      When found the create a page link on the screen
      Then the create a page link is enabled



  # FLOWS
  # [access Facebook login page -  check valid user]
  Scenario Outline: TC1.12 - access Facebook main page with valid credentials
      When fill out the form with valid credentials <username> <password>
      Then the Facebook page is reached out

    Examples:
      | username      | password |
      | <validOne>    | 1234567  |
      | <validTwo>    | 9876543  |


  # [access Facebook login page -  check invalid user credentials (user email) ]
  Scenario Outline: TC1.13 - access Facebook main page with invalid credentials
      When fill out the form with invalid credentials <username> <password>
      Then the Facebook page is reached out

    Examples:
      | username                 | password |
      | <invalidOne@email>       | 1234567  |
      | <invalidTwo@mailnet.com> | 9876543  |


  # [access Facebook login page -  check invalid user credentials (user phone number) ]
  Scenario Outline: TC1.14 - access Facebook main page with invalid credentials
    When fill out the form with invalid credentials <phonenumber> <password>
    Then the system displays a message of error

    Examples:
      | phonenumber | password |
      | <9999999>   | 1234567  |
      | <12345678>  | 9876543  |

  # [access Facebook login page -  empty credentials]
  Scenario: TC1.15 - access Facebook main page with empty credentials
    When clicked on the LogIn button
    Then the system displays a message of error


