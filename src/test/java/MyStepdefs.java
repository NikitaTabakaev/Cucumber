import io.cucumber.java.ru.Дано;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefs {
//
//        @Then("^Start quest$")
//        public void starQuest() {
//            String a = "фильм на вечер";
//
//            System.setProperty("webdriver.chrome.driver",
//                    "C:/Users/keshi/OneDrive/Рабочий стол/MavenProject/driver/chromedriver.exe");
//            WebDriver driver = CucumberDriver.getDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.google.com/");
//            WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//            search.sendKeys(a);
//            search.submit();
//            Assert.assertEquals(a + " - Поиск в Google", driver.getTitle());
//        }

    @Дано("Открыть сайт {string}")
    public void openWebSite(String webSite) {
        WebDriver driver = CucumberDriver.getDriver();
        driver.manage().window().maximize();
        driver.get(webSite);
    }

    @Дано("Ввести текст {string} в поле и нажать enter")
    public void enterTextInSearch(String text) {
        WebDriver driver = CucumberDriver.getDriver();
        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        search.sendKeys(text);
        search.submit();
    }




}
