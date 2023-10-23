package StepDefinition;
import Pages.ProductsPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;


public class ProductSteps {
    ProductsPage prodpage = new ProductsPage(driver);
    public static WebDriver driver;


    @Then("Select a Product")
    public void selectAProduct() throws InterruptedException {
        prodpage.select_product();
    }

    @Then("Go to Cart")
    public void goToCart() {
        prodpage.gotocart();
    }

    @Then("Proceed to checkout")
    public void proceedToCheckout() {
        prodpage.finishselection();
    }

    @Then("^Enter Information (.*) (.*) (.*)$")
    public void enterInformationFirstnameLastnameZipCode(String first, String last, String code) {
        prodpage.fillinfoform(first, last, code);
    }
    @Then("Verify Information and Finish")
    public void verifyInformationAndFinish() {
        prodpage.click_continue();
        prodpage.click_finish();
    }
}
