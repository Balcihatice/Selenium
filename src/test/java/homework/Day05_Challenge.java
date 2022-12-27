package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day05_Challenge {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home¬");
        // ~ click on Phones & PDAs
        driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=24']")).click();
        // ~ get the brandName of phones telefonlarin markasini alin
        driver.findElement(By.tagName(""));
        // ~ click on add to button for all elements

        // ~ click on black total added cart button
        // ~ get the names of list from the cart
        // ~ compare the names from displaying list and cart list


    }
}
