package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.*;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class SearchFieldSteps extends GeneralSteps {
    private sPage spage = new sPage(driver);

    @Given("^Open the webpage$")
    public void openTheWebpage() {
        driver.get("http://www.demoshop24.com/");
    }

    @When("^I click on the searchField$")
    public void iClickOnTheSearchField() {
        spage.searchField.click();
    }


    @When("^Insert a product description: \"([^\"]*)\"$")
    public void insertAProductDescription(String description) {

        spage.enterDescriptionInSearchField(description);
    }


    @And("^press on the magnifying glass button$")
    public void pressOnTheMagnifyingGlassButton() {
        spage.clickOnMagnGlassButton();
    }


    @And("^there is a no matches message: \"([^\"]*)\"$")
    public void thereIsANoMatchesMessage(String message) {
        assertThat(spage.noMatchesMessage.getText()).contains(message);
    }

    @Then("^Click on Search in product descriptions checkbox$")
    public void clickOnSearchDescCheckbox() {
        spage.clickOnCheckbox();
    }

    @Then("^press searchButton$")
    public void pressSearchButton() {
        spage.clickSearchButton();
    }

    @Then("^check that: \"([^\"]*)\" is on the page$")
    public void checkThatProductIsOnThePage(String product) {
        assertThat(spage.actualProductName.getText()).contains(product);
    }
}


