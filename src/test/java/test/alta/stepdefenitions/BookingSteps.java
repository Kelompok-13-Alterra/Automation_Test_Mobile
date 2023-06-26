package test.alta.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.HomeScreen;
import test.alta.pages.OfficeScreen;
import test.alta.pages.PaymentScreen;

public class BookingSteps {
    @Steps
    HomeScreen homeScreen;
    @Steps
    OfficeScreen officeScreen;
    @Steps
    PaymentScreen paymentScreen;


    @Given("I am on home page")
    public void OnTheHomePage(){
        Assert.assertTrue(homeScreen.OnTheHomePage());
    }
    @When("I click on the office button")
    public void CLickOfficeButton(){
        homeScreen.CLickOfficeButton();
    }
    @Then("I am on the office page")
    public void OnTheOfficePage(){
        Assert.assertTrue(officeScreen.OnTheOfficePage());
    }
    @And("I click on the booking button")
    public void CLickBookingButton(){
        officeScreen.CLickBookingButton();
    }
    @And("I click on the start date button")
    public void CLickStartDateButton(){
        officeScreen.CLickStartDateButton();
    }
    @And("I click on the end date button")
    public void CLickEndDateButton(){
        officeScreen.CLickEndDateButton();
    }
    @And("I click on the save button")
    public void CLickSaveButton(){
        officeScreen.CLickSaveButton();
    }
    @And("I click on the next button")
    public void CLickNextButton(){
        officeScreen.CLickNextButton();
    }
    @And("I click on the choose payment method button")
    public void CLickChoosePaymentButton(){
        officeScreen.CLickChoosePaymentButton();
    }
    @And("I click on the bni button")
    public void CLickBniButton(){
        officeScreen.CLickBniButton();
    }
    @And("I click on the payment button")
    public void CLickPaymentButton(){
        officeScreen.CLickPaymentButton();
    }
    @And("I am on the payment page")
    public void OnThePaymentPage(){
        Assert.assertTrue(paymentScreen.OnThePaymentPage());
    }
}
