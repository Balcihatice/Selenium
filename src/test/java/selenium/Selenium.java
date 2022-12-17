package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver","/Users/haticebalci/Desktop/Masaüstü - hatice MacBook Air/selenium/libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
    }
}
