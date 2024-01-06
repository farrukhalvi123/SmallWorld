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
    @Then("Selecting filter")
    public static void userClicksOnFilter() throws InterruptedException{
        clickonFilter();
        Thread.sleep(2000);
    }


    @Then("select filter from low to high")
    public static void selectFilter() throws InterruptedException{
        firstfilterselect();
    }

    @Then("verifies product prices order")
    public void verifyFilterSorting() throws InterruptedException{
        verifyfilterapplicationandprices();
    }


    @Then("Remove item from the cart")
    public void removeItemFromTheCart() throws InterruptedException {
        removeitem();

    }
}
