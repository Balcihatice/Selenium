package day01_drivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;

public class Homework2 {

    //Amazon soyfasina gidelim. https://www.amazon.com/
    //Sayfanin konumunu ve boyutlarini yazdirin
    //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
    //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
    //Sayfayi kapatin
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");

        System.out.println(driver.manage().window().getPosition());//konum
        System.out.println(driver.manage().window().getSize());//boyut


        driver.manage().window().setPosition(new Point(15, 40));
        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(900, 600));
        System.out.println(driver.manage().window().getSize());
    }
}
