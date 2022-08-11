package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.*;
public class sPage extends Page {

    @FindBy(how = How.XPATH, using = "//input[@name=\"search\"]")
    public WebElement searchField;

    @FindBy(how = How.ID, using = "button-search")
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//p[text()='There is no product that matches the search criteria.']")
    public WebElement noMatchesMessage;

    @FindBy(how = How.CSS, using = ".btn-lg , .fa-search")
    public WebElement magnGlButton;

    @FindBy(how = How.ID, using = "description")
    public WebElement descriptionCheckbox;

    @FindBy(how = How.CLASS_NAME, using = "caption")
    public WebElement actualProductName;

    public sPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterDescriptionInSearchField(String productDesc) {
        searchField.click();
        searchField.sendKeys(productDesc);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickOnCheckbox() {
        descriptionCheckbox.click();
    }

    public void clickOnMagnGlassButton() {
        magnGlButton.click();
    }

    public String getNoMatchesMessage() {
        driver.waitForElementPresent(noMatchesMessage);
        return noMatchesMessage.getText();
    }


}


