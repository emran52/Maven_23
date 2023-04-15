package Action_Items;

import Reuseable_Lirary.Reuseable_methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Best_Buy {

    public static void main(String[] args) throws InterruptedException {

        //set up the chrome driver
        Reuseable_methods ReusableMethods;
        WebDriver driver = Reuseable_methods.defineChromeDriver();

        //navigate to BestBuy home page 1
        driver.navigate().to("https://www.bestbuy.com");

        //declare the explicit wait command
        //WebDriverWait wait = new WebDriverWait(driver,20);

        //type on search field using sendkeys method 2
        Reuseable_methods.sendKeysMethod(driver,"//*[@id='gh-search-input']","iphone","Search Field");

        //click on the search icon 3
        Reuseable_methods.clickMethod(driver,"//*[@class='header-search-icon']","Search Icon");


        //select bestselling from the dropdown using selectbytext method 4
        Reuseable_methods.selectMethod(driver,"//*[@id='sort-by-select']","Best Selling","Sort By");

        Thread.sleep(3000);

        //click on first iphone using clickbyindex method 5
        Reuseable_methods.clickMethodByIndex(driver,"//*[@class='sku-title']",0,"First Iphone");

        Thread.sleep(5000);

        //use scrollbyelement to scroll down until you see Learn About TotalTech 6
        Reuseable_methods.scrollIntoViewMethod(driver,"//*[@class='c-button c-button-outline c-button-md c-button-block v-m-top-xs']","Best Selling","Sort By");



        //click on Add to cart button 7
        Reuseable_methods.clickMethod(driver,"//*[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']","cart button");


        Thread.sleep(3000);


        //capture cart subtotal and only print out amount  8
        String subtotal = driver.findElement(By.xpath("//*[@class='d-flex']")).getText();
        String[] subTotalOnly = subtotal.split(":");
        //print out only amount
        System.out.println("Cart Subtotal: " + subTotalOnly[1]);



        //hover on continue shopping (use mousehover method) 9
        try {
            Actions mouseAction = new Actions(driver);
            WebElement sendTab = driver.findElement(By.xpath("//*[@class='c-button-link continue-shopping']"));
            mouseAction.moveToElement(sendTab).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover to Continue Shopping " + e);
        }


        // click on continue shopping 10

        try {
            Actions mouseAction = new Actions(driver);
            WebElement trackingLink = driver.findElements(By.xpath("//*[@class='c-button-link continue-shopping']")).get(0);
            mouseAction.moveToElement(trackingLink).click().perform();
        } catch (Exception e) {
            System.out.println("unable to click on continue shopping: " + e);
        }
    }// end of main

}//end of class
