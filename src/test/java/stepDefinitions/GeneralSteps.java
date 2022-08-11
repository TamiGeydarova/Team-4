package stepDefinitions;

import cucumber.api.java.en.Given;
import flowWorkers.WebDriverLib;

public class GeneralSteps {

    protected WebDriverLib driver;

    public GeneralSteps() {
        this.driver = new WebDriverLib();
    }

}
