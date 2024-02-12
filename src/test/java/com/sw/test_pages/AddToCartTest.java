package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends Base {

    Login login;
    Regestration regestration;
    NewArrivals newArrivals;
    MyAccount myAccount;
    AddToCart addToCart;

    public AddToCartTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        baseMethod();
        regestration=new Regestration();
        login= regestration.existing_User();
        myAccount= login.login(props.getProperty("phoneNO"), props.getProperty("password") );
        newArrivals=myAccount.setNewBooks();
        addToCart=newArrivals.clickonBooktogocart();
    }

    @Test(testName = "Adding books to Cart")
    public void cart() throws InterruptedException {
        addToCart.setAdd_to_Cart();
    }

    @Test(testName = "Removing Book from Cart")
    public void toremovebookfromcart() throws InterruptedException {
        cart();
        addToCart.setRemoveBook(0);
    }

    @Test(testName = "Moving Book from Cart to Wishlist")
    public void moveto_wishlist_fromcart() throws InterruptedException {
        cart();
        addToCart.setMovewishlist(0);
    }

    @Test(testName = "Adding the Quantity of Books")
    public void addthequesntityofbook() throws InterruptedException {
        cart();
        addToCart.setAddQuantity(0);
    }

    @Test(testName = "Substracting the Quantity of Books")
    public void minusthequesntityofbook() throws InterruptedException {
        cart();
        addToCart.setMinusQuantity(0);
    }

    @Test(testName = "Changing the Curency")
    public void setcurrency() throws InterruptedException {
        cart();
        addToCart.setCurrency();
    }

}
