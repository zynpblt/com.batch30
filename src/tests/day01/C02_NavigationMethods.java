package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethods {
    //  1. Yeni bir Class olusturalim.(NavigationMethods)
    // 2. Youtube ana sayfasina gidelim . "https://www.techproeducation.com///  3. Amazon soyfasina gidelim. https://www.amazon.com/// 4. Tekrar YouTube’sayfasina donelim
    //5. Yeniden Amazon sayfasina gidelim
    //6. Sayfayi Refresh(yenile) yapalim
    //7. Sayfayi tam ekran yapalim
    //8. Sayfayi kapatalim / Tum sayfalari kapatalim
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.techproeducation.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();




    }



}
