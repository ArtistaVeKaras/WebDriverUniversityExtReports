package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class FillFormySteps extends DriverFactory {


    @Given("^The user as accces to the formy Website$")
    public void the_user_as_accces_to_the_formy_Website() throws Throwable {
        fill_form.getUrl();
    }

    @Given("^The user clicks on complete form$")
    public void the_user_clicks_on_complete_form() throws Throwable {
        fill_form.clickCompleteForm();
        Thread.sleep(4000);
    }

    @Given("^The webform is displayed$")
    public void the_webform_is_displayed() throws Throwable {
        fill_form.webFormIsDisplayed();
    }

    @Given("^the user enters details$")
    public void the_user_enters_details(DataTable details) throws Throwable {
        fill_form.enterUserDetails(details,0,0);
        Thread.sleep(4000);
    }

    @Given("^The user click Submit form$")
    public void the_user_click_Submit_form() throws Throwable {
        fill_form.clickSubmitButton();
    }

    @Then("^The user should be presented with a thank you message$")
    public void the_user_should_be_presented_with_a_thank_you_message() throws Throwable {

    }
}
