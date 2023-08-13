package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ordering {

    public class ShoppingCartStepDefinitions {
        private WebDriver driver;
      
        @Given("User searches for HP Pen Drive")
        public void goToHomepage() {
          driver = new ChromeDriver();
          driver.get("https://www.example.com");
        }
      
        @When("Add the first result on the page with quantity <qty>")
        public void searchForItem(String item) {
          WebElement searchBox = driver.findElement(By.id("search-box"));
          searchBox.sendKeys(item);
          searchBox.submit();
        }
      
        @Then("the cart should display {int} pen drives")
        public void verifyCartContents(int expectedQty) {
          WebElement cart = driver.findElement(By.cssSelector("#cart"));
          List<WebElement> items = cart.findElements(By.cssSelector(".cart-item"));
          int actualQty = items.size();
          assertEquals(expectedQty, actualQty);
        }
      }

}