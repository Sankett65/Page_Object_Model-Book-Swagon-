package com.sw.pages;

import com.sw.base.Base;
import com.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddToCart extends Base {

    @FindBy(linkText = "Add to Cart")
    WebElement add_to_Cart;

    @FindBy(linkText = "Go to Cart")
    WebElement go_to_Cart;

    @FindBy(xpath = "//div[@class='roundbgcontent shoppingcartroundwrapper']//ul//li")
    List<WebElement> addedtocartBookList;

    @FindBy(xpath = "//a[text()='Remove']")
    List<WebElement> removeBook;

    @FindBy(xpath = "//a[text()='Move to Wishlist']")
    List<WebElement> movewishlist;

    @FindBy(name = "ctl00$phBody$BookCart$lvCart$ctrl0$btnMinus")
    WebElement minusQuantity;

    @FindBy(name = "ctl00$phBody$BookCart$lvCart$ctrl0$btnPlus")
    WebElement addQuantity;

    @FindBy(name = "ctl00$phBody$ddlCurrency")
    WebElement currency;
    public AddToCart(){
        PageFactory.initElements(driver,this);
    }

    public void setAdd_to_Cart() throws InterruptedException {
        add_to_Cart.click();
        Utility.timing_in_Second(3);
        go_to_Cart.click();
    }

    public Wishlist setRemoveBook(int bookNumber) throws InterruptedException {
        addedtocartBookList.get(bookNumber).click();
       Utility.timing_in_Second(3);
        removeBook.get(bookNumber).click();
        return new Wishlist();
    }


    public void setMovewishlist(int bookNumber) throws InterruptedException {
        addedtocartBookList.get(bookNumber).click();
        Utility.timing_in_Second(3);
        movewishlist.get(bookNumber).click();
    }

    public void setAddQuantity(int booknumber) throws InterruptedException {
        addedtocartBookList.get(booknumber).click();
        Utility.timing_in_Second(3);
        addQuantity.click();
    }

    public void setMinusQuantity(int booknumber) throws InterruptedException {
        addedtocartBookList.get(booknumber).click();
        Utility.timing_in_Second(3);
        minusQuantity.click();
    }

    public void setCurrency(){
        currency.click();
        Select select = new Select((currency));
        select.selectByIndex(1);

    }
}
