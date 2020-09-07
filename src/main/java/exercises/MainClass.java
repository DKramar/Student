/*
package exercises;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\GD\\Projects\\maven\\drivers\\geckodriver.exe"); //инициализация драйвера FireFox

        WebDriver driver = new FirefoxDriver(); // создаем новый класс FirefoxDriver

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // задание времени ожидания, 10 секунд

        driver.manage().window().maximize(); // управление размером окна браузера (полноэкранный режим)
        driver.manage().window().setSize(new Dimension( 900,  500)); // задаем размеры окна вручную

        driver.get ("https://www.seleniumhq.org"); //вызываем метод get и переходим на сайт
        driver.navigate().to("http://google.com.ua"); //альтернативный метод загрузки страниц
        driver.navigate().back(); // возврат на предыдущую страницу
        driver.navigate().forward(); // переход на страницу вперед
        driver.navigate().refresh(); // метод который перезагружает страницу
        driver.get("https://www.mheducation.com/highered/product/1260110710.html"); //переходим на страницу MHE

        System.out.println(driver.getTitle()); //вывод заголовка страницы
        System.out.println(driver.getCurrentUrl());// получить текущую урлю

        driver.quit(); // метод который закрывает драйвер после его работы
    }
}
*/
