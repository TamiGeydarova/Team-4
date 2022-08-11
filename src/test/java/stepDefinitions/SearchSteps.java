package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePage;
import pageObjects.SearchResultPage;

import static org.junit.Assert.*;

public class SearchSteps extends GeneralSteps {

    private HomePage homePage = new HomePage(driver);
    private SearchResultPage searchResultPage = new SearchResultPage(driver);

    @Given("^I am on the home page$")
    public void openHomePage() {
        driver.openWebPage("");
    }

    @When("^I perform search from home page with: \"(.*)\"")
    public void performSearchFromHomePage(String value) {
        homePage.performSearchFromHeader(value);
    }

    @Then("^I am on Search result page$")
    public void checkIAmOnTheSearchPage() {
        String expectedRoute = "product/search";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains(expectedRoute));
        assertTrue(searchResultPage.checkLocationByRouteName(expectedRoute));
    }

    @Then("^Search query matches the: \"(.*)\"$")
    public void checkSearchQueryMArchesTheValue(String value) {
       String searchQuery = driver.findElement(By.cssSelector("#content h1")).getText();
       String expectedValue = "Search - " + value;
       assertEquals(expectedValue, searchQuery);
    }

 //////////////////////////////////////////////////////////////////////////////////

    @Given("^I am on the search page$")
    public void openSearchPage() {
        driver.openWebPage("/index.php?route=product/search");
    }

    @When("^I perform search from search page with: \"(.*)\"$")
    public void performSearchFromSearchPage(String value) {
        searchResultPage.performSearchFromSearchPage(value);
    }

    @Then("^No search results display is not present$")
    public void checkNoSearchDisplayIsNotPresent() {
        assertFalse(searchResultPage.isNoSearchResultDisplayVisible());
    }

    @Then("^Search results are not empty$")
    public void checkResultsAreNotEmpty() {
       assertTrue(searchResultPage.hasSearchResults());
    }

////////////////////////////////////////////////////////////////////////

    @Then("^Search results are empty$")
    public void checkResultsAreEmpty() {
        assertFalse(searchResultPage.hasSearchResults());
    }

    @Then("^No search results display is present$")
    public void noSearchResultsDisplayIsPresent() {
        assertTrue(searchResultPage.isNoSearchResultDisplayVisible());
    }
}


