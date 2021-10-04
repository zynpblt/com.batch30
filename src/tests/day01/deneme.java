package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        //Verify

        String expectedTitle="techproeducation";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("test is PASSED");
        }else{
            System.out.println("test is FAILED");
            System.out.println("Actual title is:"+actualTitle);
        }
        String expectedUrl="techproeducation";
        String  actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("icerir");
        }else{
            System.out.println("icermez");
            System.out.println("gecerli url"+actualUrl);

        }
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        Thread.sleep(2000);


        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.navigate().forward();
        driver.manage().window().maximize();

        String expectedAmazonTitle="Amazon";
        String actualAmazonTitle= driver.getTitle();
        if (actualAmazonTitle.contains(expectedAmazonTitle)){
            System.out.println("amazon pass");
        }else{
            System.out.println("amazon fail");
            System.out.println("actualAmazonTitle = " + actualAmazonTitle);
        }
        String expectedAmazonUrl="https://www.amazon.com/";
        String actualAmazonUrl= driver.getCurrentUrl();
        if (actualAmazonUrl.equals(expectedAmazonUrl)){
            System.out.println("Amazon url is passed");

        }else{
            System.out.println("Amazon url is failed");
            System.out.println("actualAmazonUrl = " + actualAmazonUrl);
        }

        /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        6. Tekrar “facebook” sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser’i kapatin
        deneme push
         */







        driver.quit();


    }
}
