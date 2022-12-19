package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();// Bos bir browser açtık
        driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz

        System.out.println("Sayfa Başlığı : " + driver.getTitle());
        System.out.println("Sayfa Url'i : " + driver.getCurrentUrl());

       // System.out.println(driver.getPageSource());//Icinde olunan sayfanin kaynak kodlarini getirir
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz

    }
}
