package homepage;

import org.testng.annotations.Test;
import start.CommonAPI;

public class GetTitle extends CommonAPI {
    @Test
    public void titleOfPage() {
        System.out.println(driver.getTitle());
    }
}
