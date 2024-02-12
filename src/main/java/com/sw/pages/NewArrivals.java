package com.sw.pages;

import com.sw.base.Base;
import com.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewArrivals extends Base {

    @FindBy(xpath = "//div[@class='row bestsellerbox']//div[@class='col-sm-20']")
    List<WebElement> booklist;

    @FindBy(xpath = "//div[@class='d-block position-relative fitertype mt-4'][2]//ul//li")
    List<WebElement> languageslist;

    @FindBy(xpath = "//div[@class='d-block position-relative fitertype mt-4'][1]//ul//li")
    List<WebElement> bindinglist;

    @FindBy(linkText = "Buy Now")
    WebElement buyNow_Btn;



    public NewArrivals(){
        PageFactory.initElements(driver,this);
    }
    public AddToCart clickonBooktogocart() {
        booklist.get(0).click();
        return new AddToCart();
    }

    public Wishlist clickonBooktogo_Wishlist() {
        booklist.get(0).click();
        return new Wishlist();
    }


    public Shipping clickonBooktogo_ButNow() {
        booklist.get(0).click();
        buyNow_Btn.click();
        return new Shipping();
    }
    public void setLanguages(int language) throws InterruptedException {
        Utility.timing_in_Second(5);
        languageslist.get(language).click();

    }

    public  void setBindinglist(int binding) throws InterruptedException {
        Utility.timing_in_Second(5);
        bindinglist.get(binding).click();
    }

}
