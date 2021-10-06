package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {
        //amazon web sayfasina gidip
        //java icin arama yapin
        //ve bulunan sonuc sayisini yazdirin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java"+ Keys.ENTER);

        WebElement sonucYazisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());
        //webelementler obje oldugu icin direk yazdirilmazlar
        //webelementin sahip oldugu yaziyi string olarak yazdirmak icin
        //getText() methodu kullamilir
    }
}
