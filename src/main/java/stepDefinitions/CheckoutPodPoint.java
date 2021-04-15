package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CheckoutPodPoint extends DriverFactory {

    @Given("^The user is on the \"([^\"]*)\"$")
    public void the_user_is_on_the(String url) throws Throwable {
        checkoutPodPoint_page.getUrl(url);
    }

    @When("^The user select the \"([^\"]*)\" under the car selection option$")
    public void the_user_select_the_under_the_car_selection_option(String carValue) throws Throwable {
        checkoutPodPoint_page.selectVehicleBrand(carValue);
    }

    @And("^The user selects the \"([^\"]*)\" under the car selection option$")
    public void the_user_selects_the_under_the_car_selection_option(String carId) throws Throwable {
        checkoutPodPoint_page.selectCarId(carId);
    }

    @And("^The user ticks the option to optOut$")
    public void the_user_ticks_the_option_to_optOut() throws Throwable {
        checkoutPodPoint_page.clickOptOut();
    }

    @And("^The user selects \"([^\"]*)\" under the Connection type$")
    public void the_user_selects_under_the_Connection_type(String connection) throws Throwable {
        checkoutPodPoint_page.connectionType(connection);
    }

    @And("^The user selects \"([^\"]*)\" power rating under the the Power rating section$")
    public void the_user_selects_power_rating_under_the_the_Power_rating_section(String powerOpt) throws Throwable {
        checkoutPodPoint_page.powerRatingOpt(powerOpt);
    }

    @And("^The six Compatible extras are displayed$")
    public void the_six_Compatible_extras_are_displayed() throws Throwable {
        checkoutPodPoint_page.compExtrasIsDisplayed();
    }

    @And("^The user selects a random extra$")
    public void the_user_selects_a_random_extra() throws Throwable {
        checkoutPodPoint_page.selectRandomExtra();
    }

    @Then("^The total price of the (\\d+)kW unit price \\+ the compatible price is displayed$")
    public void the_total_price_of_the_kW_unit_price_the_compatible_price_is_displayed(int arg1) throws Throwable {
        checkoutPodPoint_page.totalUnitPrice();
    }
}
