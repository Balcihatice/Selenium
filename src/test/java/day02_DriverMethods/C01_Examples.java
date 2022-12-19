package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class C01_Examples {
    /*
        İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
        Amazon sayfasına tekrar dönelim.
        Amazon sayfasının Url'inin https://www.amazon.com/ adresine eşit olduğunu test edelim
        Sayfanın konumunu ve size'ını yazdıralım
        Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
        ve istediğimiz şekilde olduğunu test edelim
        ve sayfayı kapatalım
         */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");

        //Amazon sayfasına tekrar dönelim.
        driver.navigate().back();
        driver.navigate().back();

        //Amazon sayfasının Url'inin https://www.amazon.com/ adresine eşit olduğunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="https://www.amazon.com/";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url TESTI PASSED");
        }else System.out.println("Url TESTI FAILED");

        //Sayfanın konumunu ve size'ını yazdıralım
        System.out.println("Sayfanin size`i"+ driver.manage().window().getSize());
        System.out.println("Sayfanin konumu"+ driver.manage().window().getPosition());


        //Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanin new size`i"+ driver.manage().window().getSize());
        System.out.println("Sayfanin new konumu"+ driver.manage().window().getPosition());

        //ve istediğimiz şekilde olduğunu test edelim
        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
           System.out.println("Size TESTI PASSED");
        }else System.out.println("Size TESTI FAILED");

        Point actualYeniKonum = driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum TESTI PASSED");
        }else System.out.println("Konum TESTI FAILED");

        // ve sayfayı kapatalım
        driver.close();

        //Locator olarak id kullaniyorum

    }
}
