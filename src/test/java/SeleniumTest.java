import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumTest extends TestBase {

    @Test
    public void testOpenSite() throws InterruptedException {
        driver.get("http://automationpractice.com/");
        Assertions.assertTrue(driver.getCurrentUrl().contains("automationpractice.com"));
        WebElement contactUs = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
        if (contactUs.isDisplayed())
            contactUs.click();
        Thread.sleep(1500);
        Assertions.assertTrue(driver.getCurrentUrl().contains("contact"));
    }

}
