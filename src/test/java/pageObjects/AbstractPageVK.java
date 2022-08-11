package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AbstractPageVK extends Page {

    @FindBy(how = How.CSS, using = "header #search input[name=\"search\"]")
    private WebElement headerSearchField;

    @FindBy(how = How.CSS, using = "header #search button")
    private WebElement headerSearchButton;

    @FindBy(how = How.CSS, using = ".alert")
    private List<WebElement> wishlistErrorMessageList;

    public AbstractPageVK(WebDriverLib driver) {
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
    public boolean isWishListErrorMessageVisible () {
        return wishlistErrorMessageList.size() > 0;
    }

}
