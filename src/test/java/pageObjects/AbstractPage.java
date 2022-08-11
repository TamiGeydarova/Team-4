package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage extends Page {

    @FindBy(how = How.CSS, using = "header #search input[name=\"search\"]")
    private WebElement headerSearchField;

    @FindBy(how = How.CSS, using = "header #search button")
    private WebElement headerSearchButton;

    public AbstractPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void performSearchFromHeader(String searchQuery) {
        headerSearchField.clear();
        headerSearchField.sendKeys(searchQuery);
        headerSearchButton.click();
    }


    public boolean checkLocationByRouteName (String routeName) {
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentUrl");
        System.out.println(currentURL);
        String prefix = "route=";
        String substring = prefix + routeName;
        return currentURL.contains(substring);
    }

}
