import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalenderTest {
    private WebDriver driver;
    private CalenderPage calenderPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.bestcase.com/date-calculator/");
        driver.manage().window().maximize();
        calenderPage = new CalenderPage(driver);
    }
    @Test
    public void testPickupTear(){
        int day = 7;
        int month = 6;
        int year = 1994;
        calenderPage.PickData(year, month, day);
        System.out.println(calenderPage.getDataValue());
        String expectedDate = String.format("%02d%02d%d", month, day, year);
        // Compare the actual date and expected date
        assertEquals(calenderPage.getDataValue().replace("/", ""), expectedDate);
    }





}
