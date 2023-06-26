package test.alta.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.HomeScreen;
import test.alta.pages.ProfileScreen;
import test.alta.pages.FrontScreen;

public class LogoutSteps {
    @Steps
    HomeScreen homeScreen;
    @Steps
    ProfileScreen profileScreen;
    @Steps
    FrontScreen frontScreen;


    @Given("I am in the home page")
    public void OnTheHomePage(){
        Assert.assertTrue(homeScreen.OnTheHomePage());
    }
    @When("I click the profile button")
    public void CLickProfileButton(){
        homeScreen.CLickProfileButton();
    }
    @Then("I am in the profile page")
    public void OnTheProfilePage(){
        Assert.assertTrue(profileScreen.OnTheProfilePage());
    }
    @And("I click the logout button")
    public void CLickLogoutButton(){
        profileScreen.CLickLogoutButton();
    }
    @And("I go to the front page")
    public void OnTheFrontPage(){
        Assert.assertTrue(frontScreen.OnTheFrontPage());
    }
}
