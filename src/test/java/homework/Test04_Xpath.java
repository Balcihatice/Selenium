package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test04_Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Açılan browser'ı tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();

        //Sayfa basliginin "Spend less" icerip icermedigini test edin
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Spend less")) ;

        Thread.sleep(3000);
        //Gift card sekmesine basin

        WebElement giftCardSekmesi = driver.findElement(By.xpath("//*[@class='nav-a  '][3]  "));
        giftCardSekmesi.click();
        //Birtday butonuna basin
        Thread.sleep(3000);
        WebElement birtdayButunu = driver.findElement(By.xpath("//*[@class='bxc-grid__column  bxc-grid__column--2-of-12   bxc-grid__column--light'][2]"));
        birtdayButunu.click();
        //Bestseller bolumunden ilk urunu tiklayin

        WebElement ilkWe = driver.findElement(By.xpath("//*[@id='acs-product-block-0']"));
        ilkWe.click();
        //Gift card detalis den 25$ i secin
        WebElement dolar = driver.findElement(By.xpath("//*[@id='gc-mini-picker-amount-1']"));
        dolar.click();
        //Urun ucretinin 25$ oldugunu test edin
        WebElement ucretNe = driver.findElement(By.xpath("//*[@class='a-column a-span8 gc-live-preview-amount-container']"));
        System.out.println(ucretNe.getText());

        //Urun ucretinin 25$ oldugunu test edin

        //sayfayi kapatin
        driver.close();
    }
}
