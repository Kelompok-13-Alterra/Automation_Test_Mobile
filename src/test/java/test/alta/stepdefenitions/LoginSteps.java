package test.alta.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.FrontScreen;
import test.alta.pages.LoginScreen;
import test.alta.pages.HomeScreen;

public class LoginSteps {

    @Steps
    FrontScreen frontScreen;
    @Steps
    LoginScreen loginScreen;
    @Steps
    HomeScreen homeScreen;


    @Given("I am on the front page")
    public void OnTheFrontPage(){
        Assert.assertTrue(frontScreen.OnTheFrontPage());
    }
    @When("I click on the skip button")
    public void CLickSkipButton(){
        frontScreen.CLickSkipButton();
    }
    @Then("I am in the login page")
    public void OnTheLoginPage(){
        Assert.assertTrue(loginScreen.OnTheLoginPage());
    }
    @And("I input {string} on email field")
    public void InputEmail(String email){
        loginScreen.InputEmail(email);
    }
    @And("I input {string} on password field")
    public void InputPassword(String password){
        loginScreen.InputPassword(password);
    }
    @And("I click on remember me checkbox")
    public void CLickRememberMeCheckBox(){
        loginScreen.CLickRememberMeCheckBox();
    }
    @And("I click the login button")
    public void CLickLoginButton(){
        loginScreen.CLickLoginButton();
    }
    @And("I am on the home page")
    public void OnTheHomePage(){
        Assert.assertTrue(homeScreen.OnTheHomePage());
    }
}
