package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.SearchResultPageVK;
import pageObjects.WishlistPageVK;

import static org.junit.Assert.*;

public class WishlistVKSteps extends GeneralSteps {
    private SearchResultPageVK searchResultPage = new SearchResultPageVK(driver);
    private WishlistPageVK wishlistPageVK = new WishlistPageVK(driver);

    private int addedToWishlistItemsCount = 0;

    @Then("^Add all items to wishlist _VK$")
    public void clickOnWishlistButton() throws InterruptedException {
        addedToWishlistItemsCount = searchResultPage.getSearchResultsCount();
        searchResultPage.addAllResultsToWishList();
    }

    @Then("^Alert is displayed _VK$")
    public void alertIsPresent() {
        assertTrue(searchResultPage.isWishListErrorMessageVisible());
    }
////////////////////////////////////////////////////////////////////////////

    @Given("^I am logged in _VK$")
    public void logIn() {
        driver.openWebPage("/index.php?route=account/login");
        WebElement loginInput = driver.findElement(By.cssSelector("#input-email"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#input-password"));
        WebElement loginBtn = driver.findElement(By.cssSelector("input[value=\"Login\"]"));
        loginInput.sendKeys("rigefeb389@logodez.com");
        passwordInput.sendKeys("UserUser");
        loginBtn.click();
    }

    @Given("^I am on the wishlist page _VK$")
    public void openWishlistPage() {
        driver.openWebPage("/index.php?route=account/wishlist");
    }

    @Then("^Remove wishlist items _VK$")
    public void removeWishlistItems() throws InterruptedException {
        wishlistPageVK.removeAllWishlistItems();
    }

    @And("^Wishlist is empty _VK$")
    public void checkWishlistIsEmpty() {
        assertTrue(wishlistPageVK.isWishlistEmpty());
    }

    @Then("^All products added are present in the list _VK$")
    public void checkProductsAddedToWishlist() {
        assertEquals(wishlistPageVK.getWishlistItemsCount(), addedToWishlistItemsCount);
    }
}

