package Day12_04_02_23;

import Reuseable_Lirary.Reuseable_Annotations;
import Reuseable_Lirary.Reuseable_methods;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T1_Reuseable_Annotations_Yahoo extends Reuseable_Annotations {

    @Test(priority = 1)
    public void searchForIphone(){
        ArrayList<String> phones = new ArrayList<>();
        phones.add("iphone");
        phones.add("samsung");
        for(int i=0; i<phones.size(); i++) {
            driver.navigate().to("https://www.yahoo.com");
            //enter iphone on search field
            Reuseable_methods.sendKeysMethod(driver, "//*[@name='p']", phones.get(i), "Search Field");
            //click on search icon
            Reuseable_methods.clickMethod(driver, "//*[@id='ybar-search']", "Search Icon");
            String result = Reuseable_methods.captureTextMethod(driver,"//span[@class=' fz-14 lh-22']","Search Results");
            String[] arrayResult = result.split(" ");
            System.out.println("Search Number for " + phones.get(i) + " is " + arrayResult[1]);
        }//end of loop
    }//end of test 1

    @Test(priority = 2)
    public void captureResultOnAboutPage(){
        //scroll to the bottom
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,4000)");
        Reuseable_methods.clickMethod(driver,"//*[text()='About this page']","About This page Link");
        String result = Reuseable_methods.captureTextMethod(driver,"//h1[contains(text(),'Filter and refine ')]","Results");
        System.out.println("Result: " + result);
    }//end of test 2

}//end of class
