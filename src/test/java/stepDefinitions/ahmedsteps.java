package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;

import java.util.Map;

import static org.junit.Assert.*;

public class ahmedsteps extends GeneralSteps {
    public AhmedHomPage homepage = new AhmedHomPage(driver);
    public AhmedHomPage search = new AhmedHomPage(driver);
    public AhmedHomPage subcat = new AhmedHomPage(driver);

    public AhmedHomPage newsubcat = new AhmedHomPage(driver);

    public AhmedHomPage subicon = new AhmedHomPage(driver);

    public AhmedHomPage bluesearchbutton = new AhmedHomPage(driver);
    ////////////////
    public reviewsection searchfromhome = new reviewsection(driver);

    public reviewsection selectyouritem = new reviewsection(driver);
    public reviewsection reviewbutton = new reviewsection(driver);
    public reviewsection username = new reviewsection(driver);

    public reviewsection reviewtext = new reviewsection(driver);

    public reviewsection radiorating = new reviewsection(driver);

    public reviewsection bluecontinu = new reviewsection(driver);
    private reviewsection reviewpag=new reviewsection(driver);
    private reviewsection texwarning=new reviewsection(driver);

    @Given("^open Home page$")
    public void iamonpage() {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");

    }

    @When("^click  search icon in homepage$")
    public void iclickonsearchbutton() {
        homepage.clickOnSearchButton();

    }

    @When("^i am on search page$")
    public void iamonsearchpage() {
        assertEquals("http://www.demoshop24.com/index.php?route=product/search", driver.getCurrentUrl());

    }

    @When("^user use search box to write item$")
    public void Checkupdatedstatus(Map<String, String> inputvalue) {
        search.getItem().clear();
        search.getItem().sendKeys(inputvalue.get("item"));


    }

    @When("^select categories from dropdown$")
    public void selectfromdrop() {
        subcat.clickSubCategory();


    }

    @When("^check mark  serach by subcategories$")
    public void iclicsubicon() {
        subicon.clickonsubicon();

    }

    @When("^click search blue button$")
    public void clicksearchbluebutton() throws InterruptedException {
        homepage.clickOnbluesearnbutton();
        Thread.sleep(10000);
    }

    @When("^Ensure i got the item$")
    public void aftersearch() {
        assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]")).getText().contains("Apple Cinema "));

    }
    ///////////////////////////////////////////////////////7.4.2\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("^select wrong categories from dropdown$")
    public void selectwrongcategoriesfromdropdown() {
        newsubcat.clickwrongSubCategory();

    }

    @When("^Assert Error message$")
    public void after() {
        assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]")).getText().contains("There is no product that matches the search criteria"));

    }
    //////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("^search box in home page to write item$")
    public void writename(Map<String, String> iteminput) throws InterruptedException {
        searchfromhome.getItem().clear();
        searchfromhome.getItem().sendKeys(iteminput.get("item"));
        ;

    }

    @When("^select your item$")
    public void selectyouritem() {
        selectyouritem.itemselect();

    }

    @When("^assert review page$")
    public void assertreviewpage() {
        assertEquals("http://www.demoshop24.com/index.php?route=product/product&product_id=40&search=iphone", driver.getCurrentUrl());

    }


    @When("^click on review button$")
    public void clickonreview() {
        reviewbutton.clickreview();

    }

    @When("^user write his name$")
    public void userwritehisname(Map<String, String> nameinput) {
        username.getUname().clear();
        username.getUname().sendKeys(nameinput.get("name"));


    }

    @When("^write review in text box$")
    public void writereviewintextbox(Map<String, String> textinput) {
        reviewtext.getRtext().clear();
        reviewtext.getRtext().sendKeys(textinput.get("text"));


    }

    @When("^select rating from radio button$")
    public void selectratingfromradiobutton() {
        radiorating.clickrating();

    }

    @When("^click continue button$")
    public void clickcontinuebutton() {
        bluecontinu.clickcontinubuttob();

    }

    @When("^user can see sucsses message$")
    public void usercanseesucssesessage() {
        assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().contains("Thank you for your review"));

    }

    ///////////////////////////////
    @When("^user can see Error message to fill all inputs message$")
    public void errormessagefofillallinputs() {
        //assertFalse(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().contains("please fill all fields"));
assertNotEquals("please fill all fields",driver.findElement(By.cssSelector("#form-review > div.alert.alert-danger.alert-dismissible")).getText());
    }

    @When("^user can see Error message$")
    public void  warning() {
        assertEquals("Warning: Review Name must be between 3 and 25 characters!",reviewpag.warningmessage());
    }
    @When("^user can see error message for review text$")
    public void  erroressageforreviewtext() {
        assertEquals("Warning: Review Text must be between 25 and 1000 characters!",texwarning.wartext());
    }
}
