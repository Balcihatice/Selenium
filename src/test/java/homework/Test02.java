package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test02 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.amazon.com sayfasina gidin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //Search(ara) “city bike”
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = (List<WebElement>) driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.get(0).getText());

        String[] sonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("aramaSonucSayisi -->> " + sonucSayisi[2]);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWe = driver.findElements(By.className("s-image"));
        ilkWe.get(0).click();
        driver.close();


    }
}
