
/*
Сделать скриншот и сохранить его на локальную машину для следующего списка ссылок:
https://www.amazon.co.uk
https://www.amazon.com/
https://www.bncollege.com/campus-stores/
https://www.mheducation.com/home.html
 */

import com.sun.deploy.cache.Cache;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;
import java.io.IOException;

import static com.sun.deploy.cache.Cache.copyFile;

public class ScreenShoot {
    private static WebDriver driver;
    //private static Cache FileUtils;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\GD\\Projects\\maven\\drivers\\chromedriver.exe"); //инициализация драйвера
        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk"); //переходим на страницу
        driver.manage().window().maximize(); // управление размером окна браузера (полноэкранный режим)
    }

    @AfterClass
    public static void setUpquit() {
        driver.quit();
    }

    @Test
    public void Screen(WebDriver Shot) throws Exception{

        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        copyFile(screenShot, new File("D:\\GD\\Projects\\ScreenShoots\\amazonUK\\"));
        //System.out.println("Amazon site ScreenShoot was made");


        /*//String url = "https://www.amazon.co.uk";
        driver.get("https://www.amazon.co.uk"); //переходим на страницу
        driver.manage().window().maximize(); // управление размером окна браузера (полноэкранный режим)
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\GD\\Projects\\ScreenShoots\\amazonUK\\"));
        System.out.println("Amazon site ScreenShoot was made");*/
    }
}
