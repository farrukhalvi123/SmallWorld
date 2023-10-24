package StepDefinition;
import Pages.ProductsPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import static Pages.ProductsPage.*;


public class ProductSteps {
    @Then("Select a Product")
    public void selectAProduct() throws InterruptedException {
        select_product();
    }

    @Then("Go to Cart")
    public void goToCart() throws InterruptedException {
        gotocart();
    }

    @Then("Proceed to checkout")
    public void proceedToCheckout() {
        finishselection();
    }

    @Then("^Enter Information (.*) (.*) (.*)$")
    public void enterInformationFirstnameLastnameZipCode(String first, String last, String code) throws InterruptedException {
        fillinfoform(first, last, code);
    }
    @Then("Verify Information and Finish")
    public void verifyInformationAndFinish() throws InterruptedException {
        click_continue();
        click_finish();
    }
}
