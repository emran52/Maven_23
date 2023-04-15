package Day10_03_26_23;

import Reuseable_Lirary.Reuseable_methods;
import org.openqa.selenium.WebDriver;

public class T1_Staples_reuseable_methods {

    public static void main(String[] args) throws InterruptedException {
        //set up the chrome driver
        Reuseable_methods ReusableMethods;
        WebDriver driver = Reuseable_methods.defineChromeDriver();

        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
       Reuseable_methods.sendKeysMethod(driver,"//*[@id='searchInput']","iphone","Search Field");

        //click on the search icon
        Reuseable_methods.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']","Search Icon");

        //click on first image by index
        Reuseable_methods.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,"Iphone Image");

        //click on add to the cart button
        Reuseable_methods.clickMethod(driver,"//*[@id='ctaButton']","Add to cart");

        //capture the starting price and print it out
        Thread.sleep(3000);
        String result = Reuseable_methods.captureTextMethod(driver,"//*[contains(text(),'starting at')]","Starting Price");

        System.out.println("My result is " + result);
    }//end of main 
   
}//end of class
