package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import java.util.List;

public class SearchFieldPage extends Page {

    @FindBy(how = How.XPATH, using = "//a[text()='Desktops']")
    public WebElement desktopsBlueMenu;
    @FindBy(how = How.XPATH, using = "//a[text()='Mac (1)']")
    public WebElement Mac;
    @FindBy(how = How.CLASS_NAME, using = "img-responsive")
    public WebElement iMac;
    @FindBy(how = How.ID, using = "search")
    public WebElement searchField;
    @FindBy(how = How.XPATH, using = "//a[text()='Laptops & Notebooks']")
    public WebElement laptopsBlueMenu;
    @FindBy(how = How.XPATH, using = "//a[text()='Show All Laptops & Notebooks']")
    public WebElement laptopsAndNotebooksBlueMenu;
    @FindBy(how = How.XPATH, using = "//a[text()='Cameras']")
    public WebElement camerasBlueMenu;
    @FindBy(how = How.XPATH, using = "//a[text()='Canon EOS 5D']")
    public WebElement cameras;
    @FindBy(how = How.CLASS_NAME, using = "dropdown-menu dropdown-menu-right")
    public WebElement myAccount;
    @FindBy(how = How.XPATH, using = "//span[@class='caret']")
    public WebElement myAccount2;
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-user']")
    public WebElement register;
    /*@FindBy(how = How.XPATH, using = "//input[@name=\"search\"]")
    public WebElement searchField;*/
    //driver.findElement(By.xpath("//*[@class='fa fa-user']")).click();
    //driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();

    public SearchFieldPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageUrl() {
        return "http://www.demoshop24.com/index.php?route=common/home";
    }

    public void searchFieldIsOnPlace (){
        searchField.isDisplayed();
    }
}

    //First two could be in page file, and then you need to create asserts in your steps
    /*driver.navigate().to("http://www.demoshop24.com/");
        driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.xpath("//a[text()='Desktops']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(ele).perform();
        driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();*/