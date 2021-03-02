package com.quinbay.qa.training.Actions;

import com.quinbay.qa.training.test.HomeExample;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;


public class HomeExampleActions {

    HomeExample homeExample = new HomeExample();

    public HomeExampleActions(WebDriver driver)
    {
        homeExample=PageFactory.initElements(driver,HomeExample.class);
    }


    public void searchForProduct(String item)
    {
        homeExample.searchForProduct(item);
    }
    public void selectElement(){   homeExample.selectElement(); }
    public void addToCart(){  homeExample.addToCart(); }
    public void viewCart(){ homeExample.viewCart();}
    public void checkOut(){ homeExample.checkOut();}
    public void billingDetails(String fname,String lname,String cntry,String address1,String address2,String city,String state,String pin,String num,String mail)
    {
        homeExample.billingDetails(fname,lname,cntry,address1,address2,city,state,pin,num,mail);
    }

//    public void paymentMethode(WebDriver driver)
//    {
//        homeExample.paymentMethode(driver);
//    }
    public void placeOrder(){ homeExample.placeOrder(); }





}
