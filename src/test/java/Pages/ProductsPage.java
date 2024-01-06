package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.browsersetUp;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends browsersetUp {
    public static String add_to_cart_btn = "add-to-cart-sauce-labs-backpack";
    public static String  basket_id = "shopping_cart_container";
    public static String checkout_id = "checkout";
    public static String firstname_id = "first-name";
    public static String lastname_id = "last-name";
    public static String Zipcode_id = "postal-code";
    public static String continue_name = "continue";
    public static String finish_btn_id = "finish";
    public static String clickOnFilter = "//select[@class='product_sort_container']";
    public static String selectFilter = "//option[@value='lohi']";
    public static String priceFilterClass = "inventory_item_price";

    public static String removeitem = "remove-sauce-labs-backpack";



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

    public static void clickonFilter() throws InterruptedException {
        driver.findElement(By.xpath(clickOnFilter)).click();
        Thread.sleep(2000);

    }
    public static void removeitem() throws InterruptedException{
        driver.findElement(By.id(removeitem)).click();
    }

    public static void firstfilterselect() throws InterruptedException {
        driver.findElement(By.xpath(selectFilter)).click();
        Thread.sleep(2000);

    }

    public static void verifyfilterapplicationandprices() throws InterruptedException {

        List<WebElement> priceElements = driver.findElements(By.className(priceFilterClass));

        // store prices in list
        List<Double> prices = new ArrayList<>();

        for (int i = 0; i < priceElements.size(); i++) {
            WebElement priceElement = priceElements.get(i);
            String priceText = priceElement.getText();

            double price = Double.parseDouble(priceText.replace("$", ""));
            prices.add(price);
        }
        // Check if prices are in ascending order
        for (int j = 0; j < prices.size() - 1; j++) {
            Assert.assertTrue("Prices are not in ascending order.", prices.get(j) <= prices.get(j + 1));
        }
    }
}

