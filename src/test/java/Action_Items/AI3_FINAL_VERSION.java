package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI3_FINAL_VERSION {
    public static void main(String[] args) throws InterruptedException {

        // set up WebDriverManager to use Google Chrome
        WebDriverManager.chromedriver().setup();

        //set up the Chrome options
        ChromeOptions options = new ChromeOptions();

        //use option to set Chromedriver to maximize and incognito
        options.addArguments("start-maximized", "incognito");

        //set up driver & command driver to use the option argument
        WebDriver driver = new ChromeDriver(options);

        //set up JavaScriptExecutor
        JavascriptExecutor JSE = (JavascriptExecutor)driver;

        //driver to navigate to www.weightwatchers.com/us/find-a-workshop/
        driver.navigate().to("https://www.weightwatchers.com");

        //wait 2 seconds
        Thread.sleep(2000);

        //click on  "Find a Workshop" on top right corner
        driver.findElement(By.xpath("//*[contains(text(),'Find a Work')]")).click();


        //creating a new Arraylist
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11218");
        zipcode.add("12401");
        zipcode.add("32789");

        //create a loop
        for (int i=0; i<zipcode.size(); i++) {

            //click search and iterate through the zipcode variables
            driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipcode.get(i));

            //click enter
            driver.findElement(By.xpath("//*[@id='location-search-cta']")).submit();

            //wait 2 seconds
            Thread.sleep(2000);

            //creating WebElement ArrayList for the studio & address value
            ArrayList<WebElement> studio = new  ArrayList<>(driver.findElements(By.xpath("//*[contains(text(),'WW Studio @ ')]")));
            ArrayList<WebElement> address = new ArrayList<>(driver.findElements(By.className("address-3-YC0")));


            //creating a conditional statement to click second studio link for first zipcode, third studio link for second studio and first studio link for last zipcode
            if (i==0){
                System.out.println("First address: " + address.get(0).getText());
                studio.get(1).click();

            } else if (i==1) {
                System.out.println("Second address: " + address.get(0).getText());
                studio.get(2).click();
            } else if (i==2){
                System.out.println("Third address: " + address.get(0).getText());
                studio.get(0).click();
            }//end of conditional statement

            //wait 2 seconds
            Thread.sleep(2000);

            //creating a WebElement shortcut to schedule page
            WebElement inPerson = driver.findElement(By.xpath("//*[@id='studioWorkshopSchedule']"));


            //scroll down to schedule page
            JSE.executeScript("arguments[0].scrollIntoView(true);", inPerson);

            //wait 2.5 seconds
            Thread.sleep(2500);

            //print out schedule
            System.out.println( driver.findElement(By.className("scheduleContainerMobile-1RfmF")).getText());

            //navigate back to the previous page after clicking the conditional link
            driver.navigate().back();


            //clear search bar
            driver.findElement(By.xpath("//*[@id='location-search']")).clear();
        }//end of loop

        //close driver
        driver.quit();

    }//end of main
}//end of class
