package Pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Boolean.TRUE;

public class LoginPage {
    WebDriver driver;
    By username_id = By.id("user-name");
    By password_id = By.id("password");
    By login_btn = By.id("login-button");
public LoginPage(WebDriver driver){

    this.driver = driver;
}
    public void login(String usname,String Passw){
        driver.findElement(username_id).sendKeys(usname);
        driver.findElement(password_id).sendKeys(Passw);
        driver.findElement(login_btn).click();


    }
public void verify_loginstatus() {
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

