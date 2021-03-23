package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactHelpForm extends DriverFactory {

    @Given("^The website \"([^\"]*)\" has loaded$")
    public void the_website_has_loaded(String url) throws Throwable {
        contactHelp_Page.getUrl(url);
    }

    @When("^user clicks on Help button$")
    public void user_clicks_on_Help_button() throws Throwable {
        contactHelp_Page.clickHelpBtn();
    }

    @Then("^Help screen \\(https://utilita\\.co\\.uk/help\\) will load$")
    public void help_screen_https_utilita_co_uk_help_will_load() throws Throwable {
        contactHelp_Page.checkHelpPageLoads();
    }

    @And("^The user clicks Manage your install$")
    public void the_user_clicks_Manage_your_install() throws Throwable {
        contactHelp_Page.clickManageYourInstallation();
    }

    @Then("^Manage your install screen will loads$")
    public void manage_your_install_screen_will_loads() throws Throwable {
        contactHelp_Page.checkManageyourInstallationPage();
    }

    @And("^The user clicks ‘Installation’$")
    public void the_user_clicks_Installation() throws Throwable {
        manageYourInstall_page.clickInstallationBtn();
    }

    @Then("^The installing your Smart Meter screen will show$")
    public void the_installing_your_Smart_Meter_screen_will_show() throws Throwable {
        manageYourInstall_page.checkInstallationPageLoads();
    }

    @And("^The user selects ‘Send us an email’$")
    public void the_user_selects_Send_us_an_email() throws Throwable {
        manageYourInstall_page.clickSendUsAnEmailBtn();
    }

    @Then("^Manage your install drop down will open$")
    public void manage_your_install_drop_down_will_open() throws Throwable {
        manageYourInstall_page.checkDropDownMenuIsVivisvle();
    }

    @And("^The user clicks ‘Have a question about your install\\?’$")
    public void the_user_clicks_Have_a_question_about_your_install() throws Throwable {
        manageYourInstall_page.clickHaveAQuestionBtn();
    }

    @Then("^The contact form will load$")
    public void the_contact_form_will_load() throws Throwable {
        manageYourInstall_page.checkInstallQuestionFormPageLoads();
    }

    @And("^The user chooses ‘A question about my install’ from the ‘How can we help’ field$")
    public void the_user_chooses_A_question_about_my_install_from_the_How_can_we_help_field() throws Throwable {
        manageYourInstall_page.selectDropDowmOption();
    }

    @And("^No other details are filled out$")
    public void no_other_details_are_filled_out() throws Throwable {
        System.out.println("Submitting form without details");
    }

    @And("^The user clicks Submit button$")
    public void the_user_clicks_Submit_button() throws Throwable {
        manageYourInstall_page.clickSubmitBtn();
    }

    @Then("^Error message \"([^\"]*)\" will show below the field Title$")
    public void error_message_will_show_below_the_field_Title(String message) throws Throwable {
        manageYourInstall_page.getErrorMassage(message);
    }

    @And("^Error message \"([^\"]*)\" will show below the field First name$")
    public void error_message_will_show_below_the_field_First_name(String message) throws Throwable {
        manageYourInstall_page.getErrorMassage(message);
    }

    @And("^Error message \"([^\"]*)\" will show below the field Last name$")
    public void error_message_will_show_below_the_field_Last_name(String message) throws Throwable {
        manageYourInstall_page.getErrorMassage(message);
    }

    @And("^Error message \"([^\"]*)\" will show below the field Address$")
    public void error_message_will_show_below_the_field_Address(String message) throws Throwable {
        manageYourInstall_page.getErrorMassage(message);
    }

    @And("^Error message \"([^\"]*)\" will show below the field Your question$")
    public void error_message_will_show_below_the_field_Your_question(String message) throws Throwable {
        manageYourInstall_page.getErrorMassage(message);
    }

    @And("^Error message \"([^\"]*)\" will show below the field Preferred contact method$")
    public void error_message_will_show_below_the_field_Preferred_contact_method(String message) throws Throwable {
       manageYourInstall_page.getErrorMassage(message);
    }
}
