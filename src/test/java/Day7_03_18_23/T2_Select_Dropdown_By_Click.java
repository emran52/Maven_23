package Day7_03_18_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_Select_Dropdown_By_Click {

    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();

        //add maximize for windows
        //options.addArguments("start-maximized");

        //add --kiosk for mac
        //options.addArguments("--kiosk");

        //add incognito mode to option
        options.addArguments("incognito");

        //add options to run your driver on the background(headless)
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to mlcalculate home page
        driver.navigate().to("https://www.mortgagecalculator.org/");

        //wait for 2 seconds
        Thread.sleep(2000);

        //select start month as April from the dropdown using select function
        //if the dropdown is not under select tag then click on the dropdown first
        driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //click on the dropdown value by using xpath text
        driver.findElement(By.xpath("//*[text()='Apr']")).click();


    }// end of main
}//end of class
