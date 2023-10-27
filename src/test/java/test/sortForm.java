package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class sortForm {
    public static void testSortForm() {

        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/index.php/mobile.html");
            WebElement element = driver.findElement(By.cssSelector("select"));
            // 3. Find the sort by name option and click on it
            Select select = new Select(element);
            select.selectByVisibleText("Name");
            // 4. Wait for the page to refresh and display the sorted results


            //7. Quit browser session
            driver.quit();
        }catch (Exception e){
            e.printStackTrace();
        }
        //7. Quit browser session
        driver.quit();
    }
}