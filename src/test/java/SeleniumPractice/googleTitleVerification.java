package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleTitleVerification {
    //TC #1: Facebook title verification
    //Task - 1
    //Open Chrome Browser
    //Go to https://www.facebook.com
    //Verify title: Expected: "Facebook - Log In or Sign Up"

    @Test
    public void TC1() {


        WebDriverManager.chromedriver().setup();
        //create instance of driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Facebook Title Verification PAssed");
        } else {
            System.out.println("Facebook Title Verification Failed!!!!!!!!!");
        }


        driver.close();
    }
}