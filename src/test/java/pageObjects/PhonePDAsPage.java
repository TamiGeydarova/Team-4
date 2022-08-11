package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class PhonePDAsPage extends Page{

    @FindBy(how = How.XPATH, using = "//a[text()='HTC Touch HD']")
    public WebElement firstProduct;
    @FindBy(how = How.XPATH, using = "//a[text()='iPhone']")
    public WebElement secondProduct;
    @FindBy(how = How.XPATH, using = "(//*[@class='fa fa-exchange'])[1]")
    public WebElement firstProdCompBtn;
    @FindBy(how = How.XPATH, using = "(//*[@class='fa fa-exchange'])[2]")
    public WebElement secondProdCompBtn;
    @FindBy(how = How.XPATH, using = "//a[@href='http://www.demoshop24.com/index.php?route=product/compare']")
    public WebElement productComparison;

    public PhonePDAsPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void clickOnFirstProduct(){
            firstProduct.click();
        }

    public void clickOnSecondProduct(){
        secondProduct.click();
    }

    public void clickFirstProductCompareBtn() {
        firstProdCompBtn.click();
    }

    public void clickSecondProductCompareBtn() {
        secondProdCompBtn.click();
    }

    public void clickProductCompareLink() {
        productComparison.click();
    }

}
