package Day14_04_09_23;

import Reuseable_Lirary.Reuseable_Annotations;
import Reuseable_Lirary.Reuseable_methods_logger;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T1_Staples_xpath_index extends Reuseable_Annotations {

    @Test(priority = 1)
    public void ClickOnThirdIphonByXpathIndex() throws InterruptedException {
        logger.log(LogStatus.INFO,"Navigate to Staples home page");
        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        Reuseable_methods_logger.sendKeysMethod(driver,"//*[@id='searchInput']","iphone",logger,"Search Field");

        //click on the search icon
        Reuseable_methods_logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger,"Search Icon");

        //click on third image by xpath index
        Thread.sleep(4000);
        Reuseable_methods_logger.clickMethod(driver,"(//*[@class='standard-tile__image standard-tile__image_hover'])[3]",logger,"Iphone Image");

        Thread.sleep(2000);
        //test
    }//end of test 1
   
}//end of class

