package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class ComparisonPage extends Page{

    @FindBy(how = How.XPATH, using = "//a/strong[text()='HTC Touch HD']")
    public WebElement firstProduct;
    @FindBy(how = How.XPATH, using = "//a/strong[text()='iPhone']")
    public WebElement secondProduct;

    public ComparisonPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getFirstProductsName(){
        return firstProduct.getText();
    }

    public String getSecondProductsName(){
        return secondProduct.getText();
    }

    public void firstProductIsDisplayed(){
        assertTrue(firstProduct.isDisplayed());
    }

    public void secondProductIsDisplayed(){
       assertTrue(secondProduct.isDisplayed());
    }
}
