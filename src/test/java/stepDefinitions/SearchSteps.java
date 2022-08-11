package stepDefinitions;

import java.util.Map;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ResultPage;
import pageObjects.SearchFieldPage;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchSteps extends GeneralSteps {
    private SearchFieldPage searchFieldPage = new SearchFieldPage(driver);


    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        driver.get(searchFieldPage.getPageUrl());
        driver.manage().window().maximize();
    }

    @When("^I go to Desktops$")
    public void iGoToDesktops() throws InterruptedException { // get mac
        driver.waitForElementPresent(searchFieldPage.desktopsBlueMenu);

        //w WebElement mac = driver.findElement(By.xpath("//a[text()='Desktops']"));
        //w mac.click();
        /*Actions builder = new Actions(driver);
        builder.moveToElement(mac).perform();
        driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();*/
        Thread.sleep(1000);
    }

    @And("^I go to dropdown menu$")
    public void iGoToDropdownMenu() throws InterruptedException { // mac.click()
        //driver.waitForElementPresent(searchFieldPage.iMac);
        //driver.manage().window().maximize();

        /*WebElement mac = driver.findElement(By.xpath("//a[text()='Desktops']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(mac).perform();*/
        //w driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
        searchFieldPage.desktopsBlueMenu.click();
        Thread.sleep(1000);
    }

    @And("^I select item Mac$")
    public void iSelectItemMac() throws InterruptedException {
        //driver.waitForElementPresent(searchFieldPage.Mac);
        //w driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
        searchFieldPage.Mac.click();
        Thread.sleep(1000);
    }

    @Then("^I check that search field is displayed$")
    public void iCheckThatSearchFieldIsDisplayed() {
        searchFieldPage.searchFieldIsOnPlace();
    }


    @When("^I navigate to Laptops and Notebooks$")
    public void iNavigateToLaptopsAndNotebooks() {
        driver.waitForElementPresent(searchFieldPage.laptopsBlueMenu);
    }

    @And("^I select all laptops and notebooks$")
    public void iSelectAllLaptopsAndNotebooks() {
        searchFieldPage.laptopsAndNotebooksBlueMenu.click();
    }

    @And("^I go to second dropdown menu$")
    public void iGoToSecondDropdownMenu() {
        searchFieldPage.laptopsBlueMenu.click();
    }

    @When("^I go to Cameras$")
    public void iGoToCameras() {
        driver.waitForElementPresent(searchFieldPage.camerasBlueMenu);
        searchFieldPage.camerasBlueMenu.click();
    }

    @And("^I select Canon EOS item$")
    public void iSelectCanonEOSDItem() {
        driver.waitForElementPresent(searchFieldPage.cameras);

    }

    @And("^I click on selected item$")
    public void iClickOnSelectedItem() {
        searchFieldPage.cameras.click();
    }

    @When("^I go to my account menu$")
    public void iGoToMyAccountMenu() {
        driver.waitForElementPresent(searchFieldPage.myAccount2);
    }

    @And("^I go to My Account$")
    public void iGoToMyAccount() {
        searchFieldPage.myAccount2.click();
    }

    @And("^I click on register$")
    public void iClickOnRegister() {
        searchFieldPage.register.click();
    }
}
