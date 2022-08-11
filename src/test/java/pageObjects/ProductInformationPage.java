package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage extends Page {

    @FindBy(how = How.XPATH, using = "//a[text()='Canon EOS 5D']")
    public WebElement name1;
    @FindBy(how = How.XPATH, using = "//a[text()='Description']")
    public WebElement description;
    @FindBy(how = How.XPATH, using = "//a[text()='Reviews (0)']")
    public WebElement review;
    @FindBy(how = How.XPATH, using = "//h2[contains(., '$98.00')]")
    public WebElement price;
    @FindBy(how = How.XPATH, using = "//h3[contains(., 'Available Options')]")
    public WebElement availableOptions;
    @FindBy(how = How.CLASS_NAME, using = "thumbnail")
    public WebElement image;
    @FindBy(how = How.XPATH, using = "//a[text()='Specification']")
    public WebElement specification;

    @FindBy(how = How.XPATH, using = "//a[text()='Samsung Galaxy Tab 10.1']")
    public WebElement name2;
    @FindBy(how = How.XPATH, using = "//h2[contains(., '$241.99')]")
    public WebElement price2;

    @FindBy(how = How.XPATH, using = "//h1[contains(., 'Apple Cinema')]")
    public WebElement name3;
    @FindBy(how = How.XPATH, using = "//h2[contains(., '$122.00')]")
    public WebElement price3;


    public ProductInformationPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageOneUrl() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=33&product_id=30";
    }

    public String getPageTwoUrl() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=57&product_id=49";
    }

    public String getPageThreeUrl() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=20&product_id=42";
    }

}
