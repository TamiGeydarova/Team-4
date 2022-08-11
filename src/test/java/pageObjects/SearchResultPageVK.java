package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class SearchResultPageVK extends AbstractPageVK {

    @FindBy(how = How.CSS, using = "#input-search")
    private WebElement searchField;

    @FindBy(how = How.CSS, using = "#button-search")
    private WebElement searchButton;

    @FindBy(how = How.CSS, using = "#product-search h2 + p")
    private List<WebElement> noSearchResultDisplayList;

    @FindBy(how = How.CSS, using = ".product-layout")
    private List<WebElement> searchResultsList;

    public SearchResultPageVK(WebDriverLib driver) {
        super(driver);
    }
    public void performSearchFromSearchPage(String searchQuery) {
        searchField.clear();
        searchField.sendKeys(searchQuery);
        searchButton.click();
    }
    public boolean isNoSearchResultDisplayVisible() {
        return noSearchResultDisplayList.size() > 0;
    }

    public boolean hasSearchResults() {
        return searchResultsList.size() > 0;
    }


}
