package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

    //1-Test01 isimli bir class olusturun
    //2- https://www.amazon.com/ adresine gidin
    //3- Browseri tam sayfa yapin
    //4-Sayfayi “refresh” yapin
    //5-”Salesforce Apex Questions Bank” icin arama yapiniz
    //6- Kac sonuc bulundugunu yaziniz
    //7-Sayfayi kapatin
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        String actualResult = driver.getPageSource();
        String expectedResult = "Salesforce Apex Questions Bank";

        if (actualResult.contains(expectedResult)) {
            System.out.println("Test Passed");
        } else System.out.println("Test Failed");

        //driver.findElement(By.)
        driver.close();
    }

}
