package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.browsersetUp;
public class ProductsPage extends browsersetUp {
    public static String add_to_cart_btn = "add-to-cart-sauce-labs-backpack";
    public static String  basket_id = "shopping_cart_container";
    public static String checkout_id = "checkout";
    public static String firstname_id = "first-name";
    public static String lastname_id = "last-name";
    public static String Zipcode_id = "postal-code";
    public static String continue_name = "continue";
    public static String finish_btn_id = "finish";



    public static void select_product() throws InterruptedException {
        driver.findElement(By.id(add_to_cart_btn)).click();
        Thread.sleep(2000);
    }

    public static void gotocart() throws InterruptedException {

        driver.findElement(By.id(basket_id)).click();
        Thread.sleep(2000);
    }

    public static void finishselection() {

        driver.findElement(By.id(checkout_id)).click();
    }

    public static void fillinfoform(String fname, String lname, String Zipcode) throws InterruptedException {
        driver.findElement(By.id(firstname_id)).sendKeys(fname);
        driver.findElement(By.id(lastname_id)).sendKeys(lname);
        driver.findElement(By.id(Zipcode_id)).sendKeys(Zipcode);
        Thread.sleep(2000);
    }

    public static void click_continue() {
        driver.findElement(By.id(continue_name)).click();
    }
    public static void click_finish() throws InterruptedException {

        driver.findElement(By.id(finish_btn_id)).click();
        Thread.sleep(4000);
    }
}

