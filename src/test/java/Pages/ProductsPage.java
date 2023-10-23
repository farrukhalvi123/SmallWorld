package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    public static WebDriver driver;
    By add_to_cart_btn = By.id("add-to-cart-sauce-labs-backpack");
    By basket_id = By.id("shopping_cart_container");
    By checkout_id = By.id("checkout");
    By firstname_id = By.id("first-name");
    By lastname_id = By.id("last-name");
    By Zipcode_id = By.id("postal-code");
    By continue_name = By.name("continue");
    By finish_btn_id = By.id("finish");

public ProductsPage(WebDriver driver) {
    ProductsPage.driver = driver;

    }

    public void select_product() {
        driver.findElement(add_to_cart_btn).click();
    }

    public void gotocart() {

        driver.findElement(basket_id).click();
    }

    public void finishselection() {

        driver.findElement(checkout_id).click();
    }

    public void fillinfoform(String fname, String lname, String Zipcode) {
        driver.findElement(firstname_id).sendKeys(fname);
        driver.findElement(lastname_id).sendKeys(lname);
        driver.findElement(Zipcode_id).sendKeys(Zipcode);
    }

    public void click_continue() {
        driver.findElement(continue_name).click();
    }
    public void click_finish(){

        driver.findElement(finish_btn_id).click();
    }
}

