package test.alta.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.HomeScreen;
import test.alta.pages.ResultsearchScreen;
import test.alta.pages.SearchScreen;

public class SearchSteps {
    @Steps
    HomeScreen homeScreen;
    @Steps
    SearchScreen searchScreen;
    @Steps
    ResultsearchScreen resultsearchScreen;


    @Given("I am in home page")
    public void OnTheHomePage(){
        Assert.assertTrue(homeScreen.OnTheHomePage());
    }
    @When("I click on the search field")
    public void CLickSearchField(){
        homeScreen.CLickSearchField();
    }
    @Then("I am in search page")
    public void OnTheSearchPage(){
        Assert.assertTrue(searchScreen.OnTheSearchPage());
    }
    @Then("I input {string} on search field")
    public void InputSearch(String search){
        searchScreen.InputSearch(search);
    }
    @And("I am in the result search page")
    public void OnTheResultPage(){
        Assert.assertTrue(resultsearchScreen.OnTheResultPage());
    }
}
