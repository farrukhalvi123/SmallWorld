package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browsersetUp {
    public static WebDriver driver;
    public static ChromeOptions options;
    public browsersetUp(){
        options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver-win64/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        System.out.println("I am inside Before Step and opening the browser");
    }

    public void quit() {
        this.driver.quit();
    }
}

