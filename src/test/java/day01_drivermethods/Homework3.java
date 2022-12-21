package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("youtube")) {
            System.out.println("Title Test PASSED");
        } else System.out.println("Title testi FAILED -->> " + actualTitle);

        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("youtube")) {
            System.out.println("Url Testi PASSED");
        } else System.out.println("Url testi FAILED -->> " + actualUrl);

        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // Youtube sayfasina geri donun
        Thread.sleep(3000);
        driver.navigate().back();
        //Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Amazon sayfasina donun
        Thread.sleep(3000);
        driver.navigate().forward();

        //Sayfayi tamsayfa yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        Thread.sleep(3000);
        String titleAmazon = driver.getTitle();
        if (titleAmazon.contains("Amazon")) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED -->> " + titleAmazon);
        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        Thread.sleep(3000);
        String urlAmazon = driver.getCurrentUrl();
        if (urlAmazon.contains("https://www.amazon.com/")) {
            System.out.println("Url Testi PASSED");
        } else System.out.println("Url Testi FAILED -->> " + urlAmazon);

        //Sayfayi kapatin
        driver.close();

    }
}
