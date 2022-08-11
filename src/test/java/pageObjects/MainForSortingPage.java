package pageObjects;


import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainForSortingPage extends Page {

    @FindBy(how = How.CLASS_NAME, using = "input-lg")
    public WebElement searchField;
    @FindBy(how = How.XPATH, using = "//*[@class='input-group-btn']//*[contains(@class, 'btn-lg')]")
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//a[@href='http://www.demoshop24.com/index.php?route=product/category&path=24']")
    public WebElement phoneMenuBtn;

    public MainForSortingPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageURL() {
        return "http://www.demoshop24.com/";
    }

    public void searchData(String data) {
        searchField.clear();
        searchField.sendKeys(data);
        searchButton.click();
    }

    public void clickPhoneMenuButton() {
        phoneMenuBtn.click();
    }
}
