import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonHomePage {
   private WebDriver driver;
   private WebDriverWait wait;

   //By logoAmazonID = By.id("nav-logo-sprites"); //Récupérer le logo pour vérifier l'affichage de la page Accueil
   By searchboxID = By.id("nav-search-bar-form");
   By searchbtnID = By.id("nav-search-submit-button");
   By searchcategoryListID = By.id("searchDropdownBox");


   public  AmazonHomePage(WebDriver driver, WebDriverWait wait){
      this.driver = driver;
      this.wait = wait;
   }

   public void goToHomePage(){
      this.driver.get("https://www.amazon.fr/");
   }

   public void clickSearchbtn(){
      WebElement searchbtn = this.driver.findElement(searchbtnID);
      searchbtn.click();
   }

   public void clickSearchBox(){
      WebElement searchbox = this.driver.findElement(searchboxID);
      searchbox.click();
   }
   public void searchProduct(String product){
      WebElement searchbox = this.driver.findElement(searchboxID);
      searchbox.sendKeys(product);
   }
   public void displayCategorylist(){
      WebElement categorylist = this.driver.findElement(searchcategoryListID);
      categorylist.click();
   }
   public void selectCategoryElement(String category){
       Select categorylist = new Select(driver.findElement(searchcategoryListID));
       categorylist.selectByVisibleText(category);
   }

}
