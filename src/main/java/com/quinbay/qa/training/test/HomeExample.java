package com.quinbay.qa.training.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
public class HomeExample {
//    WebDriver driver;
//
//      HomeExample(WebDriver webDriver){
//          driver=webDriver;
//   }

    @FindBy(xpath = "//input[@id='woocommerce-product-search-field-0']")
    WebElement searchBox;
     @FindBy(xpath = "//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']")
     WebElement image;
     @FindBy(xpath = "//button[@name='add-to-cart']")
     WebElement addToCart;
     @FindBy(xpath = "//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/'][text()='Cart']")
     WebElement viewcart;
     @FindBy(xpath = "//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/']")
     WebElement checkout;
     @FindBy(id = "payment_method_cod")
     WebElement cod;
     @FindBy(id="place_order")
     WebElement order;

     @FindBy(id="billing_first_name") WebElement billing_firstname;
     @FindBy(id = "billing_last_name") WebElement billing_lastname;
     //@FindBy(id = "billing_company") WebElement company;
     @FindBy(id = "billing_country") WebElement billing_country;
     @FindBy(id = "billing_address_1") WebElement billing_address;
     @FindBy(id = "billing_address_2") WebElement billing_add;
     @FindBy(id = "billing_city") WebElement billing_town;
     @FindBy(xpath = "//select[@id='billing_state']") WebElement state;
     @FindBy(id= "billing_postcode") WebElement bill_postcode;
     @FindBy(id= "billing_phone") WebElement phone;
     @FindBy(id = "billing_email") WebElement billing_mail;

    public void searchForProduct(String item)
    {
        searchBox.click();
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.RETURN);
    }
    public void selectElement(){  image.click(); }
    public void addToCart(){  addToCart.click(); }
    public void viewCart(){ viewcart.click();}
    public void checkOut(){ checkout.click();}
    public void billingDetails(String fname,String lname,String cntry,String address1,String address2,String city,String states,String pin,String num,String mail)
    {
        billing_firstname.sendKeys(fname);
        billing_lastname.sendKeys(lname);

        Select drp_country= new Select(billing_country);
        drp_country.selectByVisibleText(cntry);

        billing_address.sendKeys(address1);
        billing_add.sendKeys(address2);
        billing_town.sendKeys(city);

        Select bill_state= new Select(state);
        bill_state.selectByVisibleText(states);

        bill_postcode.sendKeys(pin);
        phone.sendKeys(num);
        billing_mail.sendKeys(mail);
    }

    public void paymentMethode(WebDriver driver)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked=true;",cod);
    }
    public void placeOrder(){ order.submit(); }






}
