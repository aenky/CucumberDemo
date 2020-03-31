package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoInit {

    WebDriver driver = null;

    @Given("I have open the browser")
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open Facebook website")
    public void goToFacebook() {
        driver.navigate().to("https://www.facebook.com/");
    }

    @Then("Login button should exits")
    public void loginButton() {
        if(driver.findElement(By.id("u_0_v")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
    }

    @When("I open nopcommerce website")
    public void goToNopcommerce() {
        driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }

    @Then("Enter Email On Textbox")
    public void enterEmail() {
        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
    }

    @Then("Enter Password On Textbox")
    public void enterPassword() {
        driver.findElement(By.id("Password")).sendKeys("admin");
    }

    @Then("Click On Login button")
    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @And("Verify that dashboard page is display")
    public void verifyDashboardPage() {
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed());
    }

    @Then("Close the browser")
    public void closeBrowser() {

        driver.quit();
    }


}
