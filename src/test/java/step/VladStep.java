    package step;

    import core.DriverFactory;
    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeEach;
    import page.VladPage;

    public class VladStep {

        VladPage vladPage =  new VladPage(DriverFactory.getDriver());

        @BeforeEach
        public void before(){ DriverFactory.getDriver();  }

        @AfterEach
        public void after(){
            DriverFactory.closeDriver();
        }


        @When("^the Facebook page is reached out$")
        @Then("^the Facebook page is reached out$")
        public void the_Facebook_page_is_reached_out() {
            vladPage.the_Facebook_page_is_reached_out();
        }


        @When("^clicked on the LogIn button$")
        @And("^clicked on the LogIn button$")
        @Then("^clicked on the LogIn button$")
        public void clicked_on_the_LogIn_button() {
            vladPage.clicked_on_the_LogIn_button();
        }

        @When("filled out the username with valid email$")
        public void filled_out_the_username_with_valid_email() {
            vladPage.filled_out_the_username_with_valid_email();
        }

        @Then("the message of invalid email format is displayed")
        public void the_message_of_invalid_email_format_is_displayed() {
            vladPage.the_message_of_invalid_email_format_is_displayed();
        }

        @Then("^the message of missing password is reached out$")
        public void the_message_of_missing_password_is_reached_out(){
            vladPage.the_message_of_missing_password_is_reached_out();
        }

        @Then("^filled out the username with invalid email format$")
        public void filled_out_the_username_with_invalid_email_format() {
            vladPage.filled_out_the_username_with_invalid_email_format();
        }

        @When("^filled out the username with valid phone number$")
        @Then("^filled out the username with valid phone number$")
        public void filled_out_the_username_with_valid_phone_number() {
            vladPage.filled_out_the_username_with_valid_phone_number();
        }

        @And("^tried to read the chars of that field$")
        public void tried_to_read_the_chars_of_that_field(){
            //try to read the value attrib of the HTML
            vladPage.tried_to_read_the_chars_of_that_field();
        }

        @When("^filled out the username with alphanumeric chars$")
        public void filled_out_the_username_with_alphanumeric_chars(){
            vladPage.filled_out_the_username_with_alphanumeric_chars();
        }

        @Then("^the message of alphanumeric combination is not allowed is reached out$")
        public void the_message_of_alphanumeric_combination_is_not_allowed_is_reached_out(){
            vladPage.the_message_of_alphanumeric_combination_is_not_allowed_is_reached_out();
        }

        @When("^filled out the username with special chars$")
        public void filled_out_the_username_with_special_chars(){
            vladPage.filled_out_the_username_with_special_chars();
        }

        @Then("^the message of special chars is not allowed is reached out$")
        public void the_message_of_special_chars_is_not_allowed_is_reached_out(){
            vladPage.the_message_of_special_chars_is_not_allowed_is_reached_out();
        }

        @And("^filled out the password with chars$")
        public void filled_out_the_password_with_chars(){
            vladPage.filled_out_the_password_with_chars();
        }

        @Then("^the message of NoSuchElementException is reached out$")
        public void the_message_of_NoSuchElementException_is_reached_out(){
            vladPage.the_message_of_NoSuchElementException_is_reached_out();
        }

        @When("^found the Login button on the screen$")
        public void found_the_Login_button_on_the_screen(){
            vladPage.found_the_Login_button_on_the_screen();
        }

        @Then("^the button is displayed")
        public void the_button_is_displayed(){
            vladPage.the_button_is_displayed();
        }

        @When("^found the forgot password link on the screen$")
        public void found_the_forgot_password_link_on_the_screen(){
            vladPage.found_the_forgot_password_link_on_the_screen();
        }

        @Then("^the Forgot Password link is enabled$")
        public void the_Forgot_Password_link_is_enabled(){
            vladPage.the_Forgot_Password_link_is_enabled();
        }

        @When("^found the Create new account button on the screen$")
        public void found_the_Create_new_account_button_on_the_screen(){
            vladPage.found_the_Create_new_account_button_on_the_screen();
        }

        @When("^found the create a page link on the screen$")
        public void found_the_create_a_page_link_on_the_screen(){
            vladPage.found_the_create_a_page_link_on_the_screen();
        }

        @Then("^the create a page link is enabled$")
        public void the_create_a_page_link_is_enabled(){
            vladPage.the_create_a_page_link_is_enabled();
        }


        /* FLOWS */
        @When("^fill out the form with valid credentials (.*) (.*)$")
        public void fill_out_the_form_with_valid_credentials_username_and_password(String username, String password){
            vladPage.fill_out_the_form_with_valid_credentials_username_and_password(username, password);
        }
        @When("^fill out the form with invalid credentials (.*)(.*)$")
        public void fill_out_the_form_with_invalid_credentials_username_and_password(String username, String password){
            vladPage.fill_out_the_form_with_invalid_credentials_username_and_password(username, password);
            vladPage.the_Facebook_page_is_reached_out();
        }

        @When("^fill out the form with invalid credentials(.*)(.*)$")
        public void fill_out_the_form_with_invalid_credentials_phonenumber_and_password(String phonenumber, String passowrd){
            vladPage.fill_out_the_form_with_invalid_credentials_phonenumber_and_password(phonenumber, passowrd);
            vladPage.the_system_displays_a_message_of_error();
        }

        @Then("^the system displays a message of error$")
        public void the_system_displays_a_message_of_error(){
            vladPage.the_system_displays_a_message_of_error();
        }


    }
