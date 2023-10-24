package Pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.browsersetUp;

import static utility.browsersetUp.*;

import static java.lang.Boolean.TRUE;

public class LoginPage extends browsersetUp {

    public static String username_id = "user-name";
    public static String password_id = "password";
    public static String login_btn = "login-button";

    public static void loginmethod(String usname,String Passw) throws InterruptedException {
        driver.findElement(By.id(username_id)).sendKeys(usname);
        driver.findElement(By.id(password_id)).sendKeys(Passw);
        driver.findElement(By.id(login_btn)).click();
        Thread.sleep(2000);


    }
public static void verify_loginstatus() {
    String productPresent = String.valueOf(driver.getPageSource().contains("Products"));
    if (productPresent.equals(String.valueOf(TRUE))){
        Assertions.assertTrue(driver.getPageSource().contains("Products"));
        System.out.println("Login Successful");
    }
    else {
        String error = String.valueOf(driver.getPageSource().contains("Epic sadface: Username and password do not match any user in this service"));
        Assertions.assertTrue(Boolean.parseBoolean(error));
        System.out.println(error + "Login Failed");


    }
}


}

