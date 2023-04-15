package day5_03_11_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Xpath_Contains {

    public static void main(String[] args) throws InterruptedException {

        //im setting uo my web driver manger for google chrome
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for bing.com search engine.
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.Yahoo.com/");

        //wait for 2 seconds  create an exception for sleep
        Thread.sleep(2000);

        //using xpath contains click on the mail link ignoring the white spaces on the test property for that element
        driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

    }//end of main
}//end of class
