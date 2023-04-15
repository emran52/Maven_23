package Day13_04_08_23;

import Reuseable_Lirary.Reuseable_Annotations;
import Reuseable_Lirary.Reuseable_methods_logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_Google_Search_logger extends Reuseable_Annotations {

    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void defineReport(){
        reports = new ExtentReports("src/main/java/HTML_Report/automationReport.html",true);
    }//end of before suite

    @Test(priority = 1)
    public void searchForCricket(){
        //give a name to the test
        logger = reports.startTest("Search for Cricket");
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
        logger = reports.startTest("Print Search Number for Cricket");
        //capture the search result
        String result = Reuseable_methods_logger.captureTextMethod(driver,"//*[@id='result-stats']",logger,"Search Results");
        logger.log(LogStatus.INFO,"Search Results: " + result);
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for cricket: " + arrayResult[1]);
        logger.log(LogStatus.INFO,"Search number for cricket: " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void writeBacktoReport(){
        //end the logger for tests
        reports.endTest(logger);
        reports.flush();
    }//end of after suite

}//end of class
