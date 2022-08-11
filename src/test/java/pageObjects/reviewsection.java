package pageObjects;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class reviewsection extends Page {

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    public WebElement item;
    @FindBy(how=How.XPATH,using = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
    public WebElement selectitem;
    @FindBy(how=How.XPATH,using = "//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")
    public WebElement reviewbutton;

    @FindBy(id = "input-name")
    public WebElement uname;

    @FindBy(id = "input-review")
    public WebElement rtext;

    @FindBy(xpath = "//*[@id=\"form-review\"]/div[4]/div/input[5]")
    public WebElement rrating;

    @FindBy(id = "button-review")
    public WebElement continueb;

    @FindBy(xpath= "//*[contains(text(),'Warning: Review Name')]")
    public WebElement namewaning;

    @FindBy(xpath= "//*[contains(text(),'Warning: Review Text')]")
    public WebElement textwarn;
    public reviewsection(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public WebElement getItem(){
        return this.item;
    }

    public void itemselect(){
        selectitem.click();
    }



    public void clickreview(){
        reviewbutton.click();
    }
    public WebElement getUname(){
        return this.uname;
    }
    public WebElement getRtext(){
        return this.rtext;
    }

    public void clickrating() {

        rrating.click();

    }
    public void clickcontinubuttob() {

        continueb.click();

    }
    public String warningmessage(){
       return  namewaning.getText();
    }
    public String wartext(){
        return  textwarn.getText();
    }



}
