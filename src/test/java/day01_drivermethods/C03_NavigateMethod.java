package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {
    //Amazon sayfasına gidelim
    //techproeducation sayfasına gidelim
    //Tekrar amazon sayfasına dönelim
    //Tekrar techproeducation sayfasına gidelim
    //Son sayfada sayfayı yenileyelim(refresh)
    //Ve sayfayı kapatalım

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        //driver.get ilede adrese gidip back ve forward methodlarini kullanabiliriz

        //techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back(); // Amazon sayfasına geri döner

        //Tekrar techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); // Techproya gider

        //Son sayfada sayfayı yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayı kapatalım
        driver.close();
    }
}
