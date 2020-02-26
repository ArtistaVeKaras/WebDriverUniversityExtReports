package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import utils.DriverFactory;

public class WordPressLogin extends DriverFactory {


    @Given("^The user has access to the WordPress website$")
    public void the_user_has_access_to_the_WordPress_website() throws Throwable {
        getDriver().get("https://wordpress.com/start/user");
        Thread.sleep(3000);
    }

    @When("^The user enters the email address$")
    public void the_user_enters_the_email_address(DataTable dataTable) throws Throwable {
        wordPressPage.enterEmail(dataTable, 1,2 );
    }

    @And("^The user enters a username$")
    public void the_user_enters_a_username(DataTable dataTable) throws Throwable {
        wordPressPage.enterUsername(dataTable, 0,2);
    }

    @And("^The user enters a password$")
    public void the_user_enters_a_password(DataTable dataTable) throws Throwable {
        wordPressPage.enterPassword(dataTable, 0,1);
    }

    @And("^The user click the create account button$")
    public void the_user_click_the_create_account_button() throws Throwable {
        wordPressPage.clickCreateAccoutnButton();
    }

    @Then("^The user should be on the WordPress main page$")
    public void the_user_should_be_on_the_WordPress_main_page() throws Throwable {
//        assertion will not be possible to perform as the website only allows to login once
    }

}
