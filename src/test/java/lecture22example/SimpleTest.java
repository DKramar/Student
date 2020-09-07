package lecture22example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SimpleTest {
    @Test
    public void simpleTest() {
//        Указываем путь к исполнительному файлу драйвера браузера и иниыциализируем WebDriver
        System.setProperty("webdriver.chrome.driver", "D:\\GD\\Student\\GchDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//       Открываем браузер на нужной странице
        driver.get("http://automationpractice.com/index.php");

//        Выполняем логин пользователя
        WebElement signIn_link = driver.findElement(By.partialLinkText("Sign in"));
        Actions action = new Actions(driver);
        action.moveToElement(signIn_link).click().build().perform();
        driver.findElement(By.id("email")).sendKeys("test_test@mail.com");
        driver.findElement(By.id("passwd")).sendKeys("Test123456");
        driver.findElement(By.id("SubmitLogin")).click();

//        Выполняем проверку имейла залогиненого пользователя
        WebElement customer_accout_link = driver.findElement(By.xpath("//a[@class='account']"));
        Assert.assertEquals("Test Test", customer_accout_link.getText());

//        Закрываем драйвер
        driver.close();
    }
}
