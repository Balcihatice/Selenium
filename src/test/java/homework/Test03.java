package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test03 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Açılan browser'ı tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //youtube sayfasina gidin
        driver.get("https://www.youtube.com");

        //Basligin "youtube"olup olmadigini kontrol edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED " + actualTitle);

        //Sayfa url sinin youtube icerip icermedigini dogrulayin icermiyorsa url yi yazdirin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://www.youtube.com";
        if (actualTitle.contains("youtube")) {
            System.out.println("Test PASSED");
        } else System.out.println(expectedUrl);

        //Daha sonra amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        //youtube sayfa sina geri donun
        driver.navigate().back();

        //sayfayi yenileyin
        driver.navigate().refresh();
        //amazon  sayfasina donun
        driver.navigate().forward();
        //sayfa basliginin "Aamazon" icerip icermedigini dogrulayin
        String actualTitleAmazon = driver.getTitle();
        String expectedTitleAmazon = "Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED " + actualTitleAmazon);

        //sayfa url sinin "https://www.amazon.com/" olup olmadigini dogrulayin
        String actualUrlAmazon = driver.getCurrentUrl();
        String expectedUrlAmazon = "http://www.amazon.com/";
        if (actualTitle.equals(expectedUrlAmazon)) {
            System.out.println("Test PASSED");
        } else System.out.println(expectedUrlAmazon);
        //Sayfayi kapatin

        driver.close();
    }
}
