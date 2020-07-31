package com.experience.cucumber.stepdefination;

import com.cucumber.listener.Reporter;
import com.experience.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Ravi's Creation
 * Date of Creation 30/07/2020
 */

public class MyStepdefs {
    @Given("^I am on Login page$")
    public void iAmOnLoginPage() {
        Reporter.addStepLog(" I am on Login page ");
    }

    @When("^I enter user name to the field \"([^\"]*)\"$")
    public void iEnterUserNameToTheField(String username)  {
        new LoginPage().enterUsernameToTheField(username);

    }

    @And("^I enter password to the field \"([^\"]*)\"$")
    public void iEnterPasswordToTheField(String password)  {
        new LoginPage().enterPasswordToTheField(password);
    }

    @And("^I click on Login submit button$")
    public void iClickOnLoginSubmitButton() {
        new LoginPage().clickOnLogInButton();
    }

    @Then("^I should Login successfully$")
    public void iShouldLoginSuccessfully() {

    }

    @Then("^I should not Login successfully$")
    public void iShouldNotLoginSuccessfully() {
    }
}
