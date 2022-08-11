package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ResultForSortingPage extends Page{

    @FindBy(how = How.ID, using = "input-sort")
    public WebElement sourceForSelect;
    @FindBy(how = How.XPATH, using = "//h4/a")
    public List<WebElement> listOfNames;
    @FindBy(how = How.CLASS_NAME, using = "price-tax")
    public List<WebElement> listOfPrice;
    @FindBy(how = How.CLASS_NAME, using = "pagination")
    public WebElement pagination;

    public ResultForSortingPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void setSourceForSelect(String text){
        Select obj = new Select(sourceForSelect);
        obj.selectByVisibleText(text);
    }

    public List<String> nameListOfSearchedItems(){
        List<String> nameListInString = new ArrayList<>();
        for(WebElement names : listOfNames){
            nameListInString.add(names.getText());
        }
        return nameListInString;
    }

    public List<String> pricesListOfSearchedItems(){
        List<String> priceListInDouble = new ArrayList<>();
        for(WebElement price : listOfPrice){
            priceListInDouble.add(price.getText().replace("Ex Tax: $", ""));
        }
        return priceListInDouble;
    }

    public List<String> nameListSortedByNameAToZ(){
        Collections.sort(nameListOfSearchedItems());
        return nameListOfSearchedItems();
    }

    public List<String> nameListSortedByNameZToA(){
        Collections.sort(nameListOfSearchedItems());
        Collections.reverse(nameListOfSearchedItems());
        return nameListOfSearchedItems();
    }

    public List<String> priceListSortedByPriceLToH(){
        Collections.sort(pricesListOfSearchedItems());
        return pricesListOfSearchedItems();
    }

    public List<String> priceListSortedByPriceHToL(){
        Collections.sort(pricesListOfSearchedItems());
        Collections.reverse(pricesListOfSearchedItems());
        return pricesListOfSearchedItems();
    }

    public void verifyingIfPaginationIsDisplayed(){
        assertTrue(pagination.isDisplayed());
    }


}
