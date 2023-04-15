package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_ {
    public static void main(String[] args) throws InterruptedException {

        //set up Web driver manager
        WebDriverManager.chromedriver().setup();

        //set up chrome options
        ChromeOptions options = new ChromeOptions();
// options.addArguments("incognito");
        //.addArguments("headless");
        options.addArguments("start-maximized");


        //set up the driver with options
        WebDriver driver = new ChromeDriver(options);

        //create ArrayList for States
        ArrayList<String> usCity = new ArrayList<>();
        usCity.add("NYC");
        usCity.add("San Francisco");
        usCity.add("Miami");

        // create an ArrayList<int> for # of adults
        ArrayList<Integer> adults= new ArrayList<>();
        adults.add(1);
        adults.add(2);
        adults.add(3);

        for (int i=0; i<usCity.size(); i++){

            //navigate to hotels.com
            driver.navigate().to("https://www.hotels.com/");

            //wait 2 seconds
            Thread.sleep(2000);

            try{
                //click on the search bracket
                WebElement goingTo = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
                goingTo.click();

            } catch (Exception e){
                //print error message
                System.out.println("Unable to click going to search" + e );
            }

            try{
                //iterate through the states ArrayList
                WebElement search = driver.findElement(By.xpath("//*[@id='destination_form_field']"));
                search.sendKeys(usCity.get(i));

            } catch (Exception e){
                //print error message
                System.out.println("Unable to type in search" + e);

                Thread.sleep(2000);
            }
            try{
                //click the dropdown bracket
                driver.findElement(By.xpath("//*[@data-stid='destination_form_field-results']")).click();

                //wait 1 second
                Thread.sleep(1000);

                //click the first index element
                driver.findElement(By.xpath("//*[@data-index='0']")).click();

            }catch (Exception e){
                //print error message
                System.out.println("Unable to click Search Result for Destination" + e);
            }

            try{

                //click on calendar
                driver.findElement(By.xpath("//*[@id='date_form_field-btn']")).click();
            } catch(Exception e){
                //print fail statement
                System.out.println("Unable to click Calendar");
            }
            Thread.sleep(2000);

            try{
                //click forward to view may and june
                driver.findElements(By.xpath("//*[@data-stid='date-picker-paging']")).get(1).click();

                //on dates june 29 and 30
                driver.findElements(By.xpath("//*[@data-day='29']")).get(1).click();
                driver.findElements(By.xpath("//*[@data-day='30']")).get(1).click();

                //click on select # night
                driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']")).click();
            }catch (Exception e){
                System.out.println("Unable to change dates");
            }

            try{
                WebElement traveler = driver.findElement(By.xpath("//*[@data-stid='open-room-picker']"));
                traveler.click();
            } catch (Exception e){
                //print error message
                System.out.println("unable to click traveler" + e);
            }
            //Arraylist button to control the # of adults and children
            ArrayList<WebElement> button = new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-layout-flex-item uitk-step-input-touch-target']")));
            try {
                //click - on adult 1 time
                button.get(0).click();
            } catch (Exception e){
                //print error statement
                System.out.println("Unable to set adult # to 1" + e);
            }

            //wait 2 seconds
            Thread.sleep(2000);

            //for loop for the # of adults
            for(int a=0; a<adults.get(i); a++){
                button.get(1).click();
            }//end of second loop

            //click add a child
            button.get(3).click();

            //create a WebElement shortcut to click child age dropdown
            WebElement childAge =  driver.findElement(By.xpath("//*[@id='age-traveler_selector_children_age_selector-0-0']"));

            if(i==0){
                childAge.click();
                Thread.sleep(1000);
                driver.findElements(By.xpath("//*[@value='1']")).get(1).click();
            }
            if (i==1){
                childAge.click();
                Thread.sleep(1000);
                driver.findElements(By.xpath("//*[@value='1']")).get(1).click();
            }
            if (i==2){

                childAge.click();
                Thread.sleep(1000);
                driver.findElements(By.xpath("//*[@value='2']")).get(0).click();
            }


            try{
                //click done
                WebElement done = driver.findElement(By.xpath("//*[@id='traveler_selector_done_button']"));
                done.click();
            } catch (Exception e){
                //print error statement
                System.out.println("Unable to click Done" + e);
            }

            try{
                //click on the search bar on the top right corner
                WebElement search = driver.findElement(By.xpath("//*[@id='search_button']"));
                search.click();
            } catch (Exception e){
                //print error statement
                System.out.println("Unable click top right search bar" + e);
            }

            //create Arraylist<> to click on resorts
            ArrayList<WebElement> resort = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid='lodging-card-responsive']")));

            //click first resort link for first i, third resort link for second i, and second resort  third i


            try{
                if (i==0) {
                    resort.get(1).click();
                }


            } catch (Exception e){
                //print error statement
                System.out.println("First condition failed" + e);
            }
            Thread.sleep(1000);
            try{
                if (i==1){
                    //click the 3rd resort
                    resort.get(2).click();
                }
            } catch (Exception e){
                //print error statement
                System.out.println("Unable to run second condition" + e);
            }
            try{
                if (i==2){
                    //click second resort
                    resort.get(1).click();
                }
            } catch (Exception e){
                //print error statement
                System.out.println("Unable to run third condition" + e);
            }


            try{
                ArrayList<WebElement> resortAddress = new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-spacing uitk-spacing-padding-block-half']")));
                //print address
                System.out.println(resortAddress.get(0).getText());
            } catch (Exception e) {
                //print error statement
                System.out.println("Unable to print address" + e);
            }


            //call the window handles in array list and switch to the new tab
            ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());
            //switch to the new tab by index of 1
            driver.switchTo().window(tabs.get(1));

            Thread.sleep(2000);

            try{
                //click on first reserve option
                driver.findElement(By.xpath("//*[text()='Rooms']")).click();


            } catch (Exception e){
                //print error statement
                System.out.println("Unable to click Rooms" + e);
            }

            //wait 2 second
            Thread.sleep(2000);

            try {
                ArrayList<WebElement> reserve = new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")));
                reserve.get(0).click();

            } catch (Exception e){
                //error statement
                System.out.println("Unable to click reserve");
            }


            try {
                //click on reserve
                WebElement inOut = driver.findElement(By.xpath("//*[@class='travel-details w-full table-bc-s ph-base mt-mouse mb-tiny']"));

                System.out.println(inOut.getText());

            }catch (Exception e){
                //print error statement
                System.out.println("Unable print In&Out Schedule" + e);
            }



            Thread.sleep(2000);

            driver.close();
            driver.switchTo().window(tabs.get(0));

        }//end of first loop

        driver. quit();


    }//end of main
}//end of class
