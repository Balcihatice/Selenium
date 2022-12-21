package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithupErisim {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fsignup%3Fref_cta%3DSign%2Bup%26ref_loc%3Dheader%2Blogged%2Bout%26ref_page%3D%252F%26source%3Dheader-home");

        WebElement giris = driver.findElement(By.id("login_field"));
        giris.sendKeys("aciceaybike@gmail.com", Keys.ENTER);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Hb20092022", Keys.ENTER);

    }
}