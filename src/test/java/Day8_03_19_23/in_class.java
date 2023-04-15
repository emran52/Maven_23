package Day8_03_19_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class in_class {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();

        //add --kiosk for mac
        //options.addArguments("--kiosk");

        //add incognito mode to option
        options.addArguments("incognito");

        //add options to run your driver on the background(headless)
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //Arraylist of US cities destinations
        ArrayList<String> destinations = new ArrayList<>();
        destinations.add("Brooklyn");
        destinations.add("Miami");
        destinations.add("San Diego");

        //navigate to hotels.com page
        driver.navigate().to("https://www.hotels.com");


        Thread.sleep(2000);

        //type city location in search field
        for (int i = 0; i < destinations.size(); i++) {
            //Click on search field
            try{
                driver.findElement(By.xpath("//*[@data-stid='destination_form_field-menu-trigger']")).click();
                System.out.println("Successfully clicked search button");
            }catch (Exception e){
                System.out.println("Failed clicked search button");
            }//end of search exception
            try {
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(destinations.get(i));
                System.out.println("Successfully typed within the search button");
            }catch (Exception e){
                System.out.println("Failed typing within search button");
            }//end of typing exception
            //click on adult list
            try {
                driver.findElement(By.xpath("//*[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")).click();
                System.out.println("Successfully clicked on adult list");
            }catch (Exception e){
                System.out.println("Failed to click on adult list");
            }//end of clicking adult list exception

            Thread.sleep(1000);

            // click adult list to 1
            try {
                driver.findElement(By.xpath("//*[@class='uitk-layout-flex-item uitk-step-input-touch-target']")).click();
                System.out.println("Successfully changed adult list to 1");
            }catch (Exception e){
                System.out.println("Failed to change adult list 1");
            }//end of adult list change to 1 exception

            //click on children list to one
            //from the dropdown using select


        }//end of for loop

        Thread.sleep(2000);


    }//end of main
}//end of clas
