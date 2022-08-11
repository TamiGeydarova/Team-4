package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.ProductInformationPage;

public class ProductInformationSteps extends GeneralSteps {
    private ProductInformationPage ProductInformationPage = new ProductInformationPage(driver);

    @Given("^I am on the page: \"([^\"]*)\"$")
    public void iAmOnThePage(String address) {
        if (address.equals("tablet")) {
            driver.get(ProductInformationPage.getPageTwoUrl());
        } else if (address.equals("monitor")) {
            driver.get(ProductInformationPage.getPageThreeUrl());
        } else {
            driver.get(ProductInformationPage.getPageOneUrl());
        }
    }

    @And("^I check name: \"([^\"]*)\"$")
    public void iCheckName(String name) {
        switch (name) {
            case "Canon":
                ProductInformationPage.name1.isDisplayed();
                break;
            case "Samsung":
                ProductInformationPage.name2.isDisplayed();
                break;
            case "Apple":
                ProductInformationPage.name3.isDisplayed();
                break;
            default:
                ProductInformationPage.name1.isDisplayed();
                break;
        }
    }

    @And("^I check review: \"([^\"]*)\"$")
    public void iCheckReview(String review) {
        ProductInformationPage.review.isDisplayed();
    }


    @And("^I check image: \"([^\"]*)\"$")
    public void iCheckImage(String image) {
        ProductInformationPage.image.isDisplayed();
    }


    @And("^I check description: \"([^\"]*)\"$")
    public void iCheckDescription(String description) {
        ProductInformationPage.description.isDisplayed();
    }

    @And("^I check price: \"([^\"]*)\"$")
    public void iCheckPrice(String price) {
        if (price.equals("241.99")) {
            ProductInformationPage.price2.isDisplayed();
        } else if (price.equals("122.00")) {
            ProductInformationPage.price3.isDisplayed();
        } else {
            ProductInformationPage.price.isDisplayed();
        }
    }

    @And("^I check available options: \"([^\"]*)\"$")
    public void iCheckAvailableOptions(String availableOptions) {
        ProductInformationPage.availableOptions.isDisplayed();
    }

    @And("^I check specification: \"([^\"]*)\"$")
    public void iCheckSpecification(String specification) {
        ProductInformationPage.specification.isDisplayed();
    }
}
