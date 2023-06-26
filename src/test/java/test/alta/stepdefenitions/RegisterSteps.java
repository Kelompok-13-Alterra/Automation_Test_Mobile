package test.alta.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.RegisterScreen;
import test.alta.pages.FrontScreen;
import test.alta.pages.LoginScreen;

public class RegisterSteps {

    @Steps
    RegisterScreen registerScreen;
    @Steps
    FrontScreen frontScreen;
    @Steps
    LoginScreen loginScreen;


    @Given("I am in the front page")
    public void OnTheFrontPage(){
        Assert.assertTrue(frontScreen.OnTheFrontPage());
    }
    @When("I click the skip button")
    public void CLickSkipButton(){
        frontScreen.CLickSkipButton();
    }
    @Then("I click the register link")
    public void CLickRegisterLink(){
        loginScreen.CLickRegisterLink();
    }
    @And("I input {string} as valid name on name field")
    public void InputValidName(String name){
        registerScreen.InputValidName(name);
    }
    @And("I input {string} as valid email on email field")
    public void InputValidEmail(String email){
        registerScreen.InputValidEmail(email);
    }
    @And("I input {string} as valid password on password field")
    public void InputValidPassword(String password){
        registerScreen.InputValidPassword(password);
    }
    @And("I confirm password")
    public void ConfirmPassword(String pass){
        registerScreen.ConfirmPassword(pass);
    }
    @And("I click on term and condition checkbox")
    public void CLickTermCheckBox(){
        registerScreen.CLickTermCheckBox();
    }
    @And("I click register button")
    public void CLickRegisterButton(){
        registerScreen.CLickRegisterButton();
    }
    @And("I am on the login page")
    public void OnTheLoginPage(){
        Assert.assertTrue(loginScreen.OnTheLoginPage());
    }

}
