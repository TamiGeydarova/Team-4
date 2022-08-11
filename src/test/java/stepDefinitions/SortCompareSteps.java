package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

import static org.junit.Assert.assertEquals;

public class SortCompareSteps extends GeneralSteps {

    private MainForSortingPage mainPage = new MainForSortingPage(driver);
    private ResultForSortingPage sortPage = new ResultForSortingPage(driver);
    private PhonePDAsPage phoneMenuPage = new PhonePDAsPage(driver);
    private ComparisonPage comparePage = new ComparisonPage(driver);
    private NProductsPage productPage = new NProductsPage(driver);

    @Given("^I am on Testing Demo Shop page$")
    public void iAmOnShopPage() {
        driver.get(mainPage.getPageURL());
    }

    @When("^I search \"(.+)\"$")
    public void startSearchEngine(String searchData) {
        mainPage.searchData(searchData);
    }

    @And("^I click to sort by \"([^\"]*)\"$")
    public void iClickToSortBy(String value) {
        sortPage.setSourceForSelect(value);
    }

    @Then("^I verify That list of products is sorted \"([^\"]*)\"$")
    public void iVerifyListIsSorted(String value) {
        if (value.equals("Name (A - Z)")) {
            assertEquals(sortPage.nameListOfSearchedItems(), sortPage.nameListSortedByNameAToZ());
        } else if (value.equals("Name (Z - A)")) {
            assertEquals(sortPage.nameListOfSearchedItems(), sortPage.nameListSortedByNameZToA());
        } else if (value.equals("Price (Low > High)")) {
            assertEquals(sortPage.pricesListOfSearchedItems(), sortPage.priceListSortedByPriceLToH());
        } else if (value.equals("Price (High > Low)")) {
            assertEquals(sortPage.pricesListOfSearchedItems(), sortPage.priceListSortedByPriceHToL());
        }
    }

    @When("^I verify that pagination is visible$")
    public void IVerifyPaginationIsVisible() {
        sortPage.verifyingIfPaginationIsDisplayed();
    }

    @When("^I click on Phones and PDAs menu button$")
    public void iClickOnPhonesMenuButton() {
        mainPage.clickPhoneMenuButton();
    }

    @And("^I click on \"HTC Touch HD\" and \"iPhone\" products compare button$")
    public void clickOnFirstAndSecondCompareButtons() {
        phoneMenuPage.clickFirstProductCompareBtn();
        phoneMenuPage.clickSecondProductCompareBtn();
    }

    @And("^I click on product comparison link$")
    public void iClickOnProductComparisonLink() {
        phoneMenuPage.clickProductCompareLink();
    }

    @And("^I verify that products \"([^\"]*)\" and \"([^\"]*)\" are in compare list$")
    public void iVerifyProductsAreInCompareList(String firstPr, String secondPr) {
        assertEquals(firstPr, comparePage.getFirstProductsName());
        assertEquals(secondPr, comparePage.getSecondProductsName());
    }

    @And("^I click on first product$")
    public void iClickOnFirstProduct() {
        phoneMenuPage.clickOnFirstProduct();
    }

    @And("^I click on comparison button$")
    public void iClickOnComparisonBtn() {
        productPage.clickCompareBtn();
    }

    @And("^I click on Phones and PDAs menu button from products page$")
    public void iClickPhonesPDAsMenuFromProducts() {
        productPage.clickPhonesPDAsPage();
    }

    @And("^I click on second product$")
    public void iClickOnSecondProduct() {
        phoneMenuPage.clickOnSecondProduct();
    }

    @And("^I click on product comparison link from product$")
    public void iClickOnProductComparisonLinkInProduct() {
        productPage.clickProductCompareLink();
    }

    @Then("^I verify that chosen products for comparison is displayed$")
    public void iVerifyProductsForComparisonIsDisplayed() {
        comparePage.firstProductIsDisplayed();
        comparePage.secondProductIsDisplayed();
    }

}
