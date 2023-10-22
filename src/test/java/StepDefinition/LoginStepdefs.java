package StepDefinition;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class LoginStepdefs {
    public WebDriver driver; // This field is declared but not initialized
    LoginPage loginPage;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    public LoginStepdefs() {
    }

    @Given("User is at Sauce Demo")
    public void user_is_on_sauce_demo() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
    }


    // Rest of the code...
    @When("^User Logins with (.*) and (.*)$")
    public void userLoginsWithUsernameAndPassword(String uname, String pwd) {

        loginPage.login(uname, pwd);
    }

    @Then("User is on Product Page")
    public void userIsOnProductPage() throws InterruptedException {
        loginPage.verify_loginstatus();

    }
    @After
    @Then("Close Windows")
    public void closeWindows() {
        driver.quit();
    }
}