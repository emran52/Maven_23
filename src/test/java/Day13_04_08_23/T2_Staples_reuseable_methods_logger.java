package Day13_04_08_23;

import Reuseable_Lirary.Reuseable_Annotations;
import Reuseable_Lirary.Reuseable_methods;
import Reuseable_Lirary.Reuseable_methods_logger;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static Reuseable_Lirary.Reuseable_Annotations.driver;
import static Reuseable_Lirary.Reuseable_Annotations.logger;

public class T2_Staples_reuseable_methods_logger extends Reuseable_Annotations {

    @Test(priority = 1)
    public void searchForCricket(){
        logger.log(LogStatus.INFO,"Navigate to Staples home page");
        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        Reuseable_methods_logger.sendKeys_Method(driver,"//*[@id='searchInput']","iphone", logger,"Search Field");

        //click on the search icon
        Reuseable_methods_logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger,"Search Icon");
    }//end of test 1

    @Test(priority = 2)
    public void printOutSearchNumber() throws InterruptedException {
        //click on first image by index
        Reuseable_methods_logger.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,logger,"Iphone Image");

        //click on add to the cart button
        Reuseable_methods_logger.clickMethodByIndex(driver,"//*[@id='ctaButton']",0,logger,"Add to cart");

        //capture the starting price and print it out
        Thread.sleep(3000);
        String result = Reuseable_methods_logger.captureTextMethod(driver,"//*[contains(text(),'starting at')]",logger,"Starting Price");
        System.out.println("Iphone result is " + result);
        logger.log(LogStatus.INFO,"Iphone result is " + result);
    }//end of test 2
   
}//end of class
