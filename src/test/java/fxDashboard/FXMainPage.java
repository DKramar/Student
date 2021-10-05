package fxDashboard;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class FXMainPage {

    @Test
    public void SignInVerify() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java-education-for-qa\\Student\\GchDriver\\chrome94\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://faculty-qa.cengage.com/");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement signIn_button = driver.findElement(By.id("login-home-button"));
        Actions action = new Actions(driver);
        action.moveToElement(signIn_button).click().build().perform();
        driver.findElement(By.id("idp-discovery-username")).sendKeys("fx.test.instructor6@fauxuni.edu");
        driver.findElement(By.id("idp-discovery-submit")).click();
        driver.findElement(By.id("okta-signin-password")).sendKeys("Cengage27");
        driver.findElement(By.id("okta-signin-submit")).click();

        WebElement dashboardText = driver.findElement(By.xpath("//*[contains(text(),'Search for Products')]"));
        Assert.assertEquals("Search for Products", dashboardText.getText());
    }
}
