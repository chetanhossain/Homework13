package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import start.CommonAPI;

public class SearchLaptop extends CommonAPI {
    @Test
    public void searchitem() throws InterruptedException {
        driver.findElement(By.id("gh-ac")).sendKeys("Laptop", Keys.ENTER);
        Thread.sleep(5000);
    }
}
