package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class Homework1 {
 /* Youtube ana sayfasina gidelim . https://www.youtube.com/
    Amazon soyfasina gidelim. https://www.amazon.com/
    Tekrar YouTube’sayfasina donelim
    Yeniden Amazon sayfasina gidelim
    Sayfa gecıslerınde 3 sanıye bekleyelım
    Sayfayi Refresh(yenile) yapalim
    Sayfayi kapatalim / Tum sayfalari kapatalim
    */
 public static void main(String[] args) throws InterruptedException {
  WebDriver driver = new ChromeDriver();

  driver.navigate().to("https://youtube.com");
  Thread.sleep(3000);
  driver.navigate().to("https://amazon.com");
  Thread.sleep(3000);
  driver.navigate().back();
  Thread.sleep(3000);
  driver.navigate().forward();
  Thread.sleep(3000);

  driver.navigate().refresh();
  driver.close();
 }
}
