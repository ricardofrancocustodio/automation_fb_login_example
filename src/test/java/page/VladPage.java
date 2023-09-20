package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VladPage extends BasePage {

    public VladPage(WebDriver driver) {
        super("VladPage", driver);
    }

    public void the_Facebook_page_is_reached_out() {
        String getFBPageURL = getURL();
        Assert.assertEquals("https://www.facebook.com/", getFBPageURL);
    }

    public void clicked_on_the_LogIn_button() {
        By clickOnLogInButton = By.id("u_0_5_HE");
        click(clickOnLogInButton);
    }

    public void filled_out_the_username_with_valid_email() {
        By validUsernameEmail = By.id("email");
        write(validUsernameEmail, "<validUserEmail>");
    }

    public void the_message_of_missing_password_is_reached_out() {
        By missingPWDDiv = By.id("error_message");
        String missingPwdMsg = getTextCustom(missingPWDDiv);
        Assert.assertEquals("please, fill up the password", missingPwdMsg);
    }

    public void filled_out_the_username_with_invalid_email_format() {
        By usernameInput = By.id("email");
        write(usernameInput, "<invalidUserEmailFormat>");
    }

    public void filled_out_the_username_with_valid_phone_number() {
        By usernameInput = By.id("email");
        write(usernameInput, "<invalidPhoneNumber>");
    }

    public void the_message_of_invalid_email_format_is_displayed() {
        By InvalidEmailDiv = By.id("invalidEmailerrorFormatMsg");
        String InvalidEmailFormatMsg = getTextCustom(InvalidEmailDiv);
        Assert.assertEquals("Invalid email format", InvalidEmailFormatMsg);
    }

    public void tried_to_read_the_chars_of_that_field() {
        By passwordInput = By.id("password");
        write(passwordInput, "123456789");

        String inputValue = getTextFromInput(passwordInput);
        Assert.assertNull(inputValue);
    }

    public void filled_out_the_username_with_alphanumeric_chars() {
        By usernameInput = By.id("email");
        write(usernameInput, "123ABCabc");
    }

    public void the_message_of_alphanumeric_combination_is_not_allowed_is_reached_out() {
        By alphaNumDivLocation = By.id("alphaNumDivMsgDisplay");
        String alphaNumDivMsg = getTextCustom(alphaNumDivLocation);
        Assert.assertEquals("Alphanumeric combination is not allowed", alphaNumDivMsg);
    }

    public void filled_out_the_username_with_special_chars() {
        By usernameInput = By.id("email");
        write(usernameInput, "!@#$%¨&*()");
    }

    public void the_message_of_special_chars_is_not_allowed_is_reached_out() {
        By specialCharsDivLocation = By.id("alphaNumDivMsgDisplay");
        String specialCharsDivMsg = getTextCustom(specialCharsDivLocation);
        Assert.assertEquals("Special chars are not allowed", specialCharsDivMsg);
    }

    public void filled_out_the_password_with_chars() {
        By passwordInput = By.id("password");
        write(passwordInput, "!@#$%¨&*()");
    }

    public void the_message_of_NoSuchElementException_is_reached_out() {
        By noSuchElementExceptionLocation = By.id("noSuchElementExceptionDisplay");
        String noSuchElementExceptionLocationMsg = getTextCustom(noSuchElementExceptionLocation);
        Assert.assertEquals("No such element was found", noSuchElementExceptionLocationMsg);
    }

    public void found_the_Login_button_on_the_screen() {
        By logInButton = By.id("u_0_5_HE");
        boolean logInButtonExists = existElementBy(logInButton);
        Assert.assertTrue(logInButtonExists);
    }

    public void the_button_is_displayed() {
        By logInButton = By.id("u_0_5_HE");
        boolean logInButtonExists = existElementBy(logInButton);
        Assert.assertTrue(logInButtonExists);

    }

    public void found_the_forgot_password_link_on_the_screen() {
        By forgotPasswordLocation = By.id("forgot_password_hyperlink");
        String forgotPasswordLink = getHyperlink(forgotPasswordLocation);
        Assert.assertEquals("Forgot password", forgotPasswordLink);
    }

    public void the_Forgot_Password_link_is_enabled() {
        By forgotPWDLinkLocation = By.id("forgot_password_hyperlink");
        String forgotPWDLinkHyperlink = getHyperlink(forgotPWDLinkLocation);
        boolean forgotPWDLink = linkIsEnabled(forgotPWDLinkHyperlink);
        Assert.assertTrue(forgotPWDLink);
    }

    public void found_the_Create_new_account_button_on_the_screen() {
        By forgotPasswordLocation = By.id("forgot_password_hyperlink");
        String forgotPasswordLink = getHyperlink(forgotPasswordLocation);
        Assert.assertEquals("Forgot password", forgotPasswordLink);
    }

    public void found_the_create_a_page_link_on_the_screen() {
        By createAPageLocation = By.id("create_a_page_hyperlink");
        String createAPageLink = getHyperlink(createAPageLocation);
        Assert.assertEquals("create a page", createAPageLink);
    }


    public void the_create_a_page_link_is_enabled() {
        By createAPageLocation = By.id("create_a_page_hyperlink");
        String createAPageHyperLink = getHyperlink(createAPageLocation);
        boolean createAPageLink = linkIsEnabled(createAPageHyperLink);
        Assert.assertTrue(createAPageLink);
    }

    public void fill_out_the_form_with_valid_credentials_username_and_password(String username, String password) {
        By validUsernameEmail = By.id("email");
        write(validUsernameEmail, username);

        By passwordInput = By.id("password");
        write(passwordInput, password);
    }

    public void fill_out_the_form_with_invalid_credentials_username_and_password(String username, String password) {
        By invalidUsernameEmail = By.id("email");
        write(invalidUsernameEmail, username);

        By inpasswordInput = By.id("password");
        write(inpasswordInput, password);
    }

    public void fill_out_the_form_with_invalid_credentials_phonenumber_and_password(String username, String password) {
        By invalidUsernamePhoneNumber = By.id("email");
        write(invalidUsernamePhoneNumber, username);

        By inpasswordInput = By.id("password");
        write(inpasswordInput, password);
    }

    public void the_system_displays_a_message_of_error() {
        By errormsgDiv = By.id("error_message");
        String errorMsg = getTextFromInput(errormsgDiv);
        Assert.assertEquals("Error!", errorMsg);
    }

    public void fill_out_form_with_valid_username() {
        By validUsernameEmail = By.id("email");
        write(validUsernameEmail, "validUsername");

    }

    public void fill_out_form_with_valid_password() {
        By passwordInput = By.id("password");
        write(passwordInput, "validPassword");

    }

    public void fill_out_form_with_invalid_username() {
        By validUsernameEmail = By.id("email");
        write(validUsernameEmail, "invalidUsername");

    }

    public void fill_out_form_with_invalid_password() {
        By passwordInput = By.id("password");
        write(passwordInput, "invalidPassword");

    }

    //mock
    public boolean isLoggedIn(){
        return false;

    }

    //mock
    public boolean isNotLoggedIn(){

        return false;

    }

    //mock
    public boolean logOff(){
        return true;
    }



}
