package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BOALoginPage {
    WebDriver driver = null;
    @Given("user opens chrome browser")
    public void user_opens_chrome_browser() {
         driver  = new ChromeDriver();
    }
    @When("user enters url")
    public void user_enters_url() {
        driver.get("https://www.bankofamerica.com/");

    }
    @When("user enters incorrect username and password")
    public void user_enters_incorrect_username_and_password() {
        driver.findElement(By.cssSelector("#onlineId1")).sendKeys("dfkjhf");
        driver.findElement(By.name("passcode1")).sendKeys("dsdfh!@332");

    }
    @When("user clicks saveID button")
    public void user_clicks_save_id_button() {
        driver.findElement(By.xpath("//input[@class = 'spa-input-option spa-input-option--checkbox']")).click();

    }
    @Then("user validate open account button")
    public void user_validate_open_account_button() {
   //     String actualErrorMessage =

    }

}
