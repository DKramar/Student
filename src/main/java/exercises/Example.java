package exercises;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

public class Example {
    public WebDriver driver;

    @Rule
    public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void failed(Throwable e, Description description) {
            if (driver != null) {
                driver.quit();
            }
        }
    };

    @BeforeClass  //@Before, @After, @AfterClass
    public static void setUpClass() {
    }

    @Test
    public void test() {
        //test
    }

    @Test
    public void test1() {
        //test
    }

    //methods
    public void methodOneName() {
    }

    public void methodTwoName() {
    }
}

