package day5_03_11_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Xpath_Text {
    public static void main(String[] args) throws InterruptedException {

        //im setting uo my web driver manger for google chrome
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for bing.com search engine.
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.Google.com/");

        //wait for 2 seconds  create an expection for sleep
        Thread.sleep(2000);

        //click on about text link
        driver.findElement(By.xpath("//*[text()='About']")).click();


    }//end of main
}//end of class
