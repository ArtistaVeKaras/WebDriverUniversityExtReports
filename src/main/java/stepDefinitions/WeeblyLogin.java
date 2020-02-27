package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class WeeblyLogin extends DriverFactory {


    @Given("^The user has access to the \"([^\"]*)\" website$")
    public void the_user_has_access_to_the_website(String url) throws Throwable {
        getDriver().get(url);
    }

    @And("^The user enters the \"([^\"]*)\" address$")
    public void the_user_enters_the_address(String user) throws Throwable {
        weebly_page.enterUsername(user);
    }

    @And("^The user enters a \"([^\"]*)\" password$")
    public void the_user_enters_a_password(String password) throws Throwable {
        weebly_page.enterPassword(password);
    }

    @And("^The user click Login button$")
    public void the_user_click_Login_button() throws Throwable {
        weebly_page.clickLoginButton();
    }

    @Then("^The user should be on the homepage$")
    public void the_user_should_be_on_the_homepage() throws Throwable {
        weebly_page.confirmWeeblyHomePage();
    }
}
