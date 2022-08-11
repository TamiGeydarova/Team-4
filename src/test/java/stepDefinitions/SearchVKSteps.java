package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePageVK;
import pageObjects.SearchResultPageVK;

import static org.junit.Assert.*;

public class SearchVKSteps extends GeneralSteps {
    private HomePageVK homePage = new HomePageVK(driver);

    private SearchResultPageVK searchResultPage = new SearchResultPageVK(driver);

    @Given("^I am on the home page _VK$")
    public void openHomePage() {
        driver.openWebPage("");
    }

    @When("^I perform search from home page with: \"(.*)\" _VK$")
    public void performSearchFromHomePage(String value) {
        homePage.performSearchFromHeader(value);
    }

    @Then("^I am on Search result page _VK$")
    public void checkIAmOnTheSearchPage() {
        String expectedRoute = "product/search";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains(expectedRoute));
        assertTrue(searchResultPage.checkLocationByRouteName(expectedRoute));
    }

    @Then("^Search query matches the: \"(.*)\" _VK$")
    public void checkSearchQueryMatchesTheValue(String value) {
       String searchQuery = driver.findElement(By.cssSelector("#content h1")).getText();
       String expectedValue = "Search - " + value;
       assertEquals(expectedValue, searchQuery);
    }

 //////////////////////////////////////////////////////////////////////////////////

    @Given("^I am on the search page _VK$")
    public void openSearchPage() {
        driver.openWebPage("/index.php?route=product/search");
    }

    @When("^I perform search from search page with: \"(.*)\" _VK$")
    public void performSearchFromSearchPage(String value) {
        searchResultPage.performSearchFromSearchPage(value);
    }

    @Then("^No search results display is not present _VK$")
    public void checkNoSearchDisplayIsNotPresent() {
        assertFalse(searchResultPage.isNoSearchResultDisplayVisible());
    }

    @Then("^Search results are not empty _VK$")
    public void checkResultsAreNotEmpty() {
       assertTrue(searchResultPage.hasSearchResults());
    }

////////////////////////////////////////////////////////////////////////

    @Then("^Search results are empty _VK$")
    public void checkResultsAreEmpty() {
        assertFalse(searchResultPage.hasSearchResults());
    }

    @Then("^No search results display is present _VK$")
    public void noSearchResultsDisplayIsPresent() {
        assertTrue(searchResultPage.isNoSearchResultDisplayVisible());
    }
}


