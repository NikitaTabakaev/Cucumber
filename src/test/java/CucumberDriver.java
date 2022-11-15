import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberDriver {
    private static WebDriver driver;

    @Before
    public static void before() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/keshi/OneDrive/Рабочий стол/MavenProject/driver/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @After
    public static void after() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
