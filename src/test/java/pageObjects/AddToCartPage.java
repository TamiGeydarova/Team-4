package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.*;

public class AddToCartPage extends Page {


    @FindBy(how = How.CSS, using = ".img-responsive")
    public WebElement pProduct;

    @FindBy(how = How.ID, using = "input-quantity")
    public WebElement pQuantity;

    @FindBy(how = How.ID, using = "button-cart")
    public WebElement addButtonOnPrPage;

    @FindBy(how = How.ID, using = "cart-total")
    public WebElement totalButton;

    @FindBy(how = How.XPATH, using = "(//*[@class='fa fa-shopping-cart'])[3]")
    public WebElement addToCarButtonFromList;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successAddText;

    public AddToCartPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnProductName() {
        pProduct.click();
    }

    public void clickOnQuantityField() {
        pQuantity.click();
    }

    public void insertQuantity(String number) {
        clickOnQuantityField();
        pQuantity.clear();
        pQuantity.sendKeys(number);
    }

    public void clickOnAddButtonOnPage() {
        addButtonOnPrPage.click();
    }


}

