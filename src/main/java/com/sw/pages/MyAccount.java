package com.sw.pages;

import com.sw.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount extends Base {

    @FindBy(xpath = "//a[@href='accountsetting.aspx']")
    WebElement personalRequirement;

    @FindBy(xpath = "//a[@href='orders.aspx']")
    WebElement myOrders;
    @FindBy(xpath = "//a[@href='wishlist.aspx']")
    WebElement myWishlist;

    @FindBy(xpath = "//a[@href='mygiftcert.aspx']")
    WebElement myGiftCertificate;

    @FindBy(xpath = "//a[@href='myaddress.aspx']")
    WebElement myAddress;
    @FindBy(xpath = "//a[@href='changepassword.aspx']")
    WebElement changePassword;

    @FindBy(linkText = "New Arrivals")
    WebElement newBooks;

    public MyAccount(){
        PageFactory.initElements(driver,this);
    }

    public void setPersonalRequirement(){
        personalRequirement.click();
    }

    public void setMyOrders(){
        myOrders.click();
    }

    public Wishlist setMyWishlist(){
        myWishlist.click();
        return new Wishlist();
    }

    public void setMyGiftCertificate(){
        myGiftCertificate.click();
    }

    public void setMyAddress(){
        myAddress.click();
    }

    public void setChangePassword(){
        changePassword.click();
    }

    public NewArrivals setNewBooks(){
        newBooks.click();
        return new NewArrivals();
    }

}
