package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NProductsPage extends Page{

    @FindBy(how = How.XPATH, using = "//button[@data-original-title='Compare this Product']")
    public WebElement compareBtn;
    @FindBy(how = How.XPATH, using = "//a[@href='http://www.demoshop24.com/index.php?route=product/category&path=24']")
    public WebElement phonesPage;
    @FindBy(how = How.XPATH, using = "//a[@href='http://www.demoshop24.com/index.php?route=product/compare']")
    public WebElement productComparison;

    public NProductsPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickPhonesPDAsPage(){
        phonesPage.click();
    }

    public void clickCompareBtn(){
        compareBtn.click();
    }

    public void clickProductCompareLink() {
        productComparison.click();
    }

}
