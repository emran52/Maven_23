package Day9_03_25_23;

import Reuseable_Lirary.Reuseable_methods;
import org.openqa.selenium.WebDriver;

public class T5_Click {
    public static void main(String[] args) throws InterruptedException {

        //on your test classes you still will declare the webdriver command you want to use
        WebDriver driver = Reuseable_methods.defineChromeDriver();

        //navigate to ups website
        driver.navigate().to("http://www.ups.com/us");

        //click on shipping
        //your explicit wait condition replaces your driver.findElement(s)
        //presenceOfAllElementsLocatedBy is same as findElements
        Object ReusableMethods;
        Reuseable_methods.clickMethod(driver,"//*[@id='mainNavDropdown1']","Shipping Link");

        //click on Schedule a Pickup
        //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
        Thread.sleep(2000);
        Reuseable_methods.clickMethod(driver,"//*[text()='Schedule a Pickup']","Schedule a Pickup");


        //click on Freight
      Reuseable_methods.clickMethod(driver,"//*[text()='Freight']","Freight");


    }//end of main
}//end of class
