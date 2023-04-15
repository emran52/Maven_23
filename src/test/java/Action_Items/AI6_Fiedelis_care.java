package Action_Items;

import Reuseable_Lirary.Reuseable_Annotations;
import Reuseable_Lirary.Reuseable_methods;
import org.apache.hc.core5.http.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AI6_Fiedelis_care extends Reuseable_Annotations {

    @Test (priority = 1)
    public static void getdentalcoverage() throws InterruptedException {
        driver.navigate().to("https://www.fideliscare.org/");

        Thread.sleep(2000);
        //click on search elements on top right
        Reuseable_methods.clickMethod(driver,"//*[@class='tool dropdown search']","search");

        Thread.sleep(3000);

        //enter get dental coverage on the search
        Reuseable_methods.sendKeysMethod(driver,"//*[@class='form-control search-input']","dental coverage","Search Field");

        Thread.sleep(3000);

        //click on search icon
        Reuseable_methods.clickMethod(driver,"//*[@class='btn btn-primary btn-search']","search Icon ");

        //capture the search results
        String result = Reuseable_methods.captureTextMethod(driver,"//*[@itemprop='itemListElement']","search result");

        //spilt and only print the search number
        String SearchResults= driver.findElement(By.xpath("//*[@id='resInfo-0']")).getText();
        String[] SearchResultsOnly = SearchResults.split(":");
        //print out only amount
        System.out.println("Search result is : " + SearchResultsOnly[0]);

    }


   @Test()
   public static void switchtonewtab() throws InterruptedException{
    //new tab opens so switch to new tab



    //(WebDriver driver,int index, String elementName)
   }










}//end of class







