package com.quinbay.qa.training.test;
import com.quinbay.qa.training.Actions.HomeExampleActions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumExample {
    public static void main(String[]args)throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");

//        Thread.sleep(3000);

        HomeExampleActions hex=new HomeExampleActions(driver);
        hex.searchForProduct("Tshirt");
        hex.selectElement();
        hex.addToCart();
        hex.viewCart();
        hex.checkOut();
        hex.billingDetails("Balaji","C","India","Agara lake,Hsr layout","Sector 1","Bengaluru","Karnataka","523091","9865437782","balaji@gmail.com");
//        hex.paymentMethode(driver);
        hex.placeOrder();

        Thread.sleep(30000);



    }


}
