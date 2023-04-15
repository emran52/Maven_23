package Day14_04_09_23;

import Reuseable_Lirary.Reuseable_Annotations;
import Reuseable_Lirary.Reuseable_methods_logger;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T2_Google_Search_Logger_Automation_Xpath_xml extends Reuseable_Annotations {

    @Test(priority = 1)
    public void searchForCricket(){
        //navigate to google home
        logger.log(LogStatus.INFO,"Navigate to Google Home page");
        driver.navigate().to("https://www.google.com");
        //type the word cricket on search field
      Reuseable_methods_logger.sendKeysMethod(driver,"//*[@name='q']","cricket",logger,"Search Field");
        //hit submit on google search
        Reuseable_methods_logger.submitMethod(driver,"//*[@name='btnK']",logger,"Google Search Button");
    }//end of test 1

    @Test(priority = 2)
    public void printOutSearchNumber(){
        //capture the search result
        String result = Reuseable_methods_logger.captureTextMethod(driver,"//*[@id='result-stats']",logger,"Search Results");
        logger.log(LogStatus.INFO,"Search Results: " + result);
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for cricket: " + arrayResult[1]);
        logger.log(LogStatus.INFO,"Search number for cricket: " + arrayResult[1]);
    }//end of test 2

}//end of class
