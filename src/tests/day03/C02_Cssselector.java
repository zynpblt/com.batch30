package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Cssselector {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        // b. Locate email textbox
        Thread.sleep(2000);
        WebElement emailTextbox=driver.findElement(By.cssSelector("#session_email"));
        emailTextbox.sendKeys("testtechproed@gmail.com");
        // c. Locate password textbox ve
        WebElement passwordtextbox=driver.findElement(By.cssSelector("#session_password"));
        passwordtextbox.sendKeys("Test1234!");
        // d. Locate signin button
        WebElement signButon=driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input"));
        Thread.sleep(1000);
        signButon.click();
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        driver.quit();
    }
}
