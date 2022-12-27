package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);
        WebElement addButunu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        addButunu.click();
        Thread.sleep(3000);
        WebElement deleteButun = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));

                if (deleteButun.isDisplayed()){
                    System.out.println("Test PASSED");
                }else System.out.println("Test FAILED");
                deleteButun.click();
        WebElement addRemovegrnrm = driver.findElement(By.xpath("//h3"));
        if(addRemovegrnrm.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


driver.close();
    }
}
