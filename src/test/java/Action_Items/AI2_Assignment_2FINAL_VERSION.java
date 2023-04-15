package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class AI2_Assignment_2FINAL_VERSION {
    public static void main(String[] args) throws InterruptedException {
        //im setting uo my web driver manger for google chrome
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for bing.com search engine.
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.bing.com/");

        //wait for 2 seconds  create an expection for sleep
        Thread.sleep(2000);

        //create an array list for values

        ArrayList<String> fastFoods = new ArrayList<>();
        fastFoods.add("Dominos");
        fastFoods.add("5guys");
        fastFoods.add("Mcdonalds");
        fastFoods.add("checkers");

        //create a for loop to cycle through each value
        for (int i=0; i<fastFoods.size(); i++){
            driver.navigate().to("https://www.bing.com/");

            //wait for 2 seconds
            Thread.sleep(2000);

            //this is the code that searches through each fastfoods value
            //send keys means find out exactly what it means
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(fastFoods.get(i));

            //click on bing search button
            //.submit means enter
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();

            //wait a few seconds
            Thread.sleep(2000);

            //capture the search message
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

            //print out only
            String[] arrayResult = result.split(" ");
            System.out.println("For " + fastFoods.get(i) + " the search number is " + arrayResult[1]);

        }//end of loop

        //command to close the driver
        driver.quit();

    }//end of main
}//end of class
