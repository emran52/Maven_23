package Day11_04_01_23;

import Reuseable_Lirary.Reuseable_methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T3_GoogleSearchTestNG_Depends_On {

    //to make variable global, you must declare it outside of the annotation methods
    WebDriver driver;


    //test is replacement of the main method to execute your code
    @Test()
    public void searchForBmw(){
        //naviage to google home
        driver.navigate().to("https://www.google.com");
        //enter bmw on search field
        Reuseable_methods.sendKeysMethod(driver,"//*[@name= 'q']","BMW","Search Field");
        //submit of google search
        Reuseable_methods.SubmitMethod(driver,"//*[@name= 'btnK']","Google Search");
    }//end of test 1

    @Test(dependsOnMethods = "searchForBmw")
    public void capturesearchnumberforBmw (){
        //capture the text and print out the number
        String result = Reuseable_methods.captureTextMethod(driver,"//*[@id='result-stats']","Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for BMW" + arrayResult[1]);
    }//end of test 2


    @Test(dependsOnMethods = {"searchForBmw","capturesearchnumberforBmw"})
    public void clickOnFinance() {
        Reuseable_methods.clickMethod(driver," //div[text()='Finance']","Finance");
    }//end of test 3


    @BeforeSuite
    public void setDriver(){
        driver = Reuseable_methods.defineChromeDriver();
    }//end of before suite

    //quit the driver
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite
}//end of class
