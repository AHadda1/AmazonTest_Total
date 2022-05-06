import io.cucumber.java8.En;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomeSteps implements En {

    private WebDriver driver;
    private WebDriverWait wait;
    private AmazonHomePage amazonPage;

    public HomeSteps(){

        Before(() -> {
                    String path = "C:\\Users\\AHadda\\IdeaProjects\\AmazonTest_Total\\src\\main\\resources\\chromedriver.exe";
                    System.setProperty("webdriver.chrome.driver", path);
                    this.driver = new ChromeDriver();
                    this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
                    this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    this.amazonPage = new AmazonHomePage(this.driver, this.wait);
        });

        Given("^the user is at the amazon home page$", () -> {
            amazonPage.goToHomePage();
        });
        And("^the user click on category list$", () -> {
           amazonPage.displayCategorylist();
        });
        When("^the user select the category {string}$", () -> {
            amazonPage.selectCategoryElement("Bagages");
        });

        Given("^the user click on the search box$", () -> {
            amazonPage.clickSearchBox();
        });
        When("^the user enter the product {String}$", () -> {
            amazonPage.searchProduct("Valise");
        });
        And("^the user click on the search button$", () -> {
            amazonPage.clickSearchbtn();
        });
        Then("^the result page should appear$", () -> {
        });

        After(() -> {
            this.driver.quit();
        });
    }
}
