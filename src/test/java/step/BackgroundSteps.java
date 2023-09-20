package step;

import core.DriverFactory;
import io.cucumber.java.pt.Dado;
import page.VladPage;

public class BackgroundSteps {

    VladPage vladPage = new VladPage(DriverFactory.getDriver());

    public void fillLoginFormWithInvalidData(){
        vladPage.fill_out_form_with_invalid_username();
        vladPage.fill_out_form_with_invalid_password();
        vladPage.clicked_on_the_LogIn_button();
    }

    public void fillLoginFormWithValidData(){
        vladPage.fill_out_form_with_valid_username();
        vladPage.fill_out_form_with_valid_password();
        vladPage.clicked_on_the_LogIn_button();
    }

    public void goToURL(){
        vladPage.navigateToURL();
    }

}

