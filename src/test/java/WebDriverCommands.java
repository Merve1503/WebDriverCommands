import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverCommands {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Timouts//
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);  // Sayfanın yüklenmesini 10 saniye bekler.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // Sayfa üzerinde yapılan işlemleri 10 saniye bekler.

        //Window//
        driver.manage().window().maximize();  // Pencereyi maximize eder.
        int X = driver.manage().window().getPosition().getX();  // Pencerenin X düzlemindeki konumunu verir.
        int Y = driver.manage().window().getPosition().getY();  // Pencerenin Y düzlemindeki konumunu verir.

        //URL//
        driver.get("https://www.google.com");  // Siteye gitmek amacıyla kullanılır.
        String CurrentURL = driver.getCurrentUrl();  // Sayfadaki URL i getirir.
        String Title = driver.getTitle();  // Sayfanın başlığını "title" ını getirir.
        String PageSource = driver.getPageSource();  // Sayfanın kaynak kodlarını getirir.

        //Navigate//
        driver.navigate().back();  // Geri gitmek için
        driver.navigate().forward();  // İleri gitmek için
        driver.navigate().refresh();  // Sayfayı yenilemek için

    }
}

