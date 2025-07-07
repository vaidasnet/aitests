import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private WebDriver driver;

    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver = new HtmlUnitDriver();
        driver.get(url);
    }

    @Then("the page title should contain {string}")
    public void the_page_title_should_contain(String expected) {
        assertNotNull(driver);
        String title = driver.getTitle();
        assertTrue("Expected title to contain '"+expected+"' but was '"+title+"'", title.contains(expected));
        driver.quit();
    }
}
