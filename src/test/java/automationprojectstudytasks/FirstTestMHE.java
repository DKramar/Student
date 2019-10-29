

import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.net.URL;
import java.sql.SQLOutput;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/*
а) Перейти на страницу - https://www.mheducation.com/highered/product/1260110710.html,
проверить что на этой странице есть ISBN 9781260110715
и проверить что цена для него равна 185.

б)  Если ISBN-a нет на странице или их несколько -
зафейлить тест с соответствующим сообщением.
 */

public class FirstTestMHE {

    public static WebDriver driver; // создаем новый класс ChromeDriver

    @BeforeClass
    public static void setUP(){
        String url = "https://www.mheducation.com/highered/product/1260110710.html";

        System.setProperty("webdriver.chrome.driver", "D:\\GD\\Projects\\maven\\drivers\\chromedriver.exe"); //инициализация драйвера
        driver = new ChromeDriver();
        driver.get(url); //переходим на страницу MHE
        driver.manage().window().maximize(); // управление размером окна браузера (полноэкранный режим)
    }

    @AfterClass
    public static void setUPquit(){
        driver.quit(); // метод который закрывает драйвер после его работы
    }

    @Test
    public void isbn() {
        try {
            String isbn13 = "9781260110715";
            String expectedPrice = "$185.00";

            String actualPrice = driver.findElement(By.xpath("//*[@data-isbn13='" + isbn13 + "']/div[3]/div/div[2]/p")).getText();

            if (expectedPrice.equals(actualPrice)) {
                System.out.println(" ");
                System.out.println("***");
                System.out.println("FOUND PRICE: " + actualPrice);
                System.out.println("***");
            }
            else {
                Assert.assertEquals("THE PRICE IS NOT FOUND ON THE PAGE!", expectedPrice, actualPrice);
            }
        }
        catch(Exception e) {
            System.out.println(" ");
            System.out.println("***");
            System.out.println("THE ISBN13 IS NOT FOUND ON THE PAGE!");
            System.out.println("***");
        }
    }
}

