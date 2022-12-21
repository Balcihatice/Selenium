package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelector {
    // Aslında ilk tercih id eğer yoksa xPath....
    // xPath de driver aramaya DOM(İnspect yaptığımız zaman açılan alan)'un
    // en başından başlıyor buna parent-child diyoruz yani önceki ve sonraki locatelere bakarak
    // bizim yazdığımız adresi buluyor yavaş ama kesin çözüm.cssSelector ü de hızlı olduğu için tercih ediyoruz.
    // Eğer hız beklentimiz yoksa nokta atışı yaparak elementi bulabilmek için xPath i tercih ediyoruz
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/ ");
        //  Sayfayi “refresh” yapin
        driver.navigate().refresh();

        // Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Spend less";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed");
        } else System.out.println("Test Failed");

        //Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //Birthday butonuna basin
        /*
        <img src="https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png"
        alt="Birthday">
         */
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();

        //7- Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestSellerB = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSellerB.get(0).click();

        //  8- Gift card details'den 25 $'i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();

        //  9-Urun ucretinin 25$ oldugunu test edin
        Thread.sleep(3000);
        WebElement urunUcreti = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if(urunUcreti.getText().equals("$25.00")){
            System.out.println("Ucret Testi PASSED");
        }else {
            System.out.println("Ucret Testi FAIlED");
        }
        //10-Sayfayi kapatin
        driver.close();


    }
}
