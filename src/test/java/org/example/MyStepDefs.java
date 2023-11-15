package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();


    @Given("user is on Nopecommerce Homepage")
    public void user_is_on_nopecommerce_homepage()
    {

    }
    @When("user click on Register button")
    public void user_click_on_register_button()
    {
        homePage.clickOnRegisterButton();
    }
    @When("user enter all required registration details")
    public void user_enter_all_required_registration_details()
    {
        registerPage.enterRegistrationDetails();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully()
    {
        registerResultPage.getConfirmationForRegistration();
    }


    @Given("user is on NopeCommerce Homepage")
    public void user_is_on_nope_commerce_homepage()
    {

    }
    @When("user hover over on computers category link")
    public void user_hover_over_on_computers_category_link()
    {
       homePage.hoverOnComputerButton();
    }
    @Then("The text color should be change")
    public void the_text_color_should_be_change()
    {
        homePage.textColor();

    }

}
