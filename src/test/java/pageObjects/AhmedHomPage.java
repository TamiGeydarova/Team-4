package pageObjects;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AhmedHomPage extends Page {
@FindBy(how=How.XPATH,using = "//*[@id=\"search\"]/span/button")
   public WebElement searchbutton;
@FindBy(id = "input-search")
public WebElement item;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/select/option[10]")
    public WebElement subCategory;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/select/option[9]")
    public WebElement wrongsubCategory;
    @FindBy(how=How.XPATH,using = "//*[@id=\"content\"]/div/div[3]/label/input")
    public WebElement subicon;


    @FindBy(how=How.XPATH,using = "//*[@id=\"button-search\"]")
    public WebElement bluesearchbutton;
    public AhmedHomPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnSearchButton(){
        searchbutton.click();
    }
    public WebElement getItem(){
        return this.item;
    }
    public void clickSubCategory() {

        subCategory.click();

    }
    public void clickonsubicon() {

        subicon.click();

    }

    public void clickOnbluesearnbutton(){
        bluesearchbutton.click();
    }
    public void clickwrongSubCategory() {

        wrongsubCategory.click();

    }



}
