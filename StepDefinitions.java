package com.testautomationdevelopment.RandomApp;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import com.testautomationdevelopment.RandomApp.pageObjects.chrome_pageObject;

public class StepDefinitions {

    chrome_pageObject chrome_object = new chrome_pageObject();

    @Given("Navigate to the website url")
    public void openingScenario() {
       chrome_object.navigateWebsite();
    }

    @And("Type any word in the text field")
    public void startingScenario() {
        chrome_object.enterRandomWord("AI");
    }

    @And("Click the search button")
    public void endingScenario() {
        chrome_object.clickButton();
    }

    @Then("Close the browser")
    public void closingScenario() {
        chrome_object.closeBrowser();
    }

}
