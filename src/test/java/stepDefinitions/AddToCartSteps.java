package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;
import pageObjects.*;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class AddToCartSteps extends GeneralSteps {
    private AddToCartPage addToCartPage = new AddToCartPage(driver);
    private sPage spage = new sPage(driver);

    @Given("^open the page$")
    public void openTheWebpage() {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20");
    }


    @Then("^insert \"([^\"]*)\" in the search field$")
    public void insertInTheSearchField(String search) {
        spage.searchField.click();
        spage.searchField.sendKeys(search);
    }

    @Then("^press search$")
    public void pressSearch() {
        spage.clickOnMagnGlassButton();
    }

    @When("^Click on the product$")
    public void clickOnTheProduct() {
        addToCartPage.clickOnProductName();
    }

    @And("^enter a product quantity: \"([^\"]*)\"$")
    public void enterAProductQuantity(String quant) {
        addToCartPage.clickOnQuantityField();
        addToCartPage.insertQuantity(quant);
    }

    @Then("^click on the \"([^\"]*)\" button$")
    public void clickOnTheButton(String add) {
        addToCartPage.clickOnAddButtonOnPage();
    }

    @Then("^Check that in the cart button is displayed right \"([^\"]*)\"$")
    public void checkThatInTheCartButtonIsDisplayedQuantity(String value) {
        assertThat(addToCartPage.totalButton.getText().contains(value));
    }

    @And("^Click on the add to cart button$")
    public void clickOnTheAddToCartButton() {
        addToCartPage.addToCarButtonFromList.click();
    }

    @Then("^Check that in the cart summary is displayed: \"([^\"]*)\"$")
    public void checkThatInTheCartSummaryIsDisplayed(String val) {
        driver.waitForElementPresent(addToCartPage.totalButton);
        assertThat(addToCartPage.totalButton.getText().contains(val));
    }

    @Then("^Check that success message is displayed$")
    public void checkThatSuccessMessageIsDisplayed() {
        assertThat(addToCartPage.successAddText.isDisplayed());
    }

    @Then("^check that cart button is displayed on page$")
    public void checkThatCartButtonIsDisplayedOnPage() {
        assertThat(addToCartPage.addButtonOnPrPage.isDisplayed());
    }

    @Then("^enter a product negative quantity \"([^\"]*)\"$")
    public void enterAProductNegativeQuantity(String negQuant) {
        addToCartPage.clickOnQuantityField();
        addToCartPage.insertQuantity(negQuant);
    }
}
