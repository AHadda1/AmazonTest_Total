import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
    private WebDriver driver;
    private WebDriverWait wait;

    By resultTitle = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/span");

    public void reseltIsdisplayed(){
        WebElement title = this.driver.findElement(resultTitle);

    }
}
