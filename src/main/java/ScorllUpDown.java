import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 22/02/2017.
 */
public class ScorllUpDown
{
    public static void main(String[] args) throws InterruptedException {
        // load browser
        WebDriver driver=new FirefoxDriver();


        // maximize browser
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Open Application
        driver.get("http://jqueryui.com");


        // Wait for 5 second
        Thread.sleep(5000);

        // This  will scroll page 400 pixel vertical
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        System.out.println("Scroll down completed ");
    }
}
