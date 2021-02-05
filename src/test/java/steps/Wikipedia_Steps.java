package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePage;
import utilities.Config;
import utilities.Driver;

public class Wikipedia_Steps {

    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();

    @Given("User is on Wikipedia HomePage")
    public void user_is_on_Wikipedia_HomePage() {
        Driver.getDriver().get(Config.getProperty("wikipediaURL"));
    }

    @When("User types {string} in the wikipedia search box")
    public void user_types_in_the_wikipedia_search_box(String string) {
        wikipediaHomePage.searchBox.sendKeys(string);
    }

    @When("User clicks wikipedia search button")
    public void user_clicks_wikipedia_search_button() {
        wikipediaHomePage.searchButton.click();
    }

    @Then("User sees {string} is in the wikipedia title")
    public void user_sees_is_in_the_wikipedia_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string + " - Wikipedia";

        Assert.assertTrue("Wikipedia title is not matching", actualTitle.equalsIgnoreCase(expectedTitle));
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String mainHeader) {
        String expectedHeader = mainHeader;
        String actualHeader = wikipediaHomePage.mainHeader.getText();

        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeader) {
        String expectedImageHeader = imageHeader;
        String actualImageHeader = wikipediaHomePage.imageHeader.getText();

        Assert.assertEquals(expectedImageHeader, actualImageHeader);
    }

}
