package Day12_04_02_23;

import Reuseable_Lirary.Reuseable_Annotations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T2_Get_Elements_Count extends Reuseable_Annotations {
    @Test
    public void getNavListCount(){

        //navigating to usps
        driver.navigate().to("https://www.usps.com");
        //store the elements list in a ArrayList with common property
        WebDriverWait wait = new WebDriverWait(driver,7);
        ArrayList<WebElement> navList = new ArrayList<>(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]"))));
        System.out.println("Count: " + navList.size());

    }//end of test
}//end of class
