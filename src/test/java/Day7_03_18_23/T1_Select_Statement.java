package Day7_03_18_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Select_Statement {

    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to mlcalculate home page
        driver.navigate().to("https://www.mortgagecalculator.org/");

        //wait for 2 seconds
        Thread.sleep(2000);

        //select start month as April from the dropdown using select function
        //store the start month locator as a webElement
        WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //call select function to store the function dropdown locator
        Select startMonthDropdown = new Select(strMonth);

        //select by visible text
        startMonthDropdown.selectByVisibleText("Apr");

        //select by value
        //startMonthDropdown.selectByValue("4");

        //select by index
        //startMonthDropdown.deselectByIndex(3);

    }// end of main
}//end of class
