package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework {
    //amazon.com a gidip java kelimesini aratin
    //kac sonuc geldigini ve gelen sonuclardan
    //4.ve 7.nin isimlerini yazdirin
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchButton.sendKeys("java"+ Keys.ENTER);
        Thread.sleep(3000);

//        List<WebElement> listOfPictures=driver.findElements(By.xpath("//img[@class='s-image']"));
//        System.out.println("listOfPictures.size() = " + listOfPictures.size());
//        for (WebElement element:listOfPictures){
//            System.out.println("element.getText() = " + element.getText());
//        }
        WebElement results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("results = " + results.getText());

        List<WebElement> AramaSonuclariListesi = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']"));
//        System.out.println("4.Eleman: "+AramaSonuclariListesi.get(3).getText());
//        System.out.println("7.Eleman: "+AramaSonuclariListesi.get(6).getText());

        String dorduncuEleman=AramaSonuclariListesi.get(3).getText();
        String yedinciEleman = AramaSonuclariListesi.get(6).getText();
        System.out.println("dorduncuEleman = " + dorduncuEleman);
        System.out.println("yedinciEleman = " + yedinciEleman);
        driver.close();


    }
}
