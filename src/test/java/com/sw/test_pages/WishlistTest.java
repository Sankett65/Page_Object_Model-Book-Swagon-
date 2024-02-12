package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.sw.base.Base.props;

//@Listeners(TestLIstner.class)
public class WishlistTest extends Base {

    MyAccount myAccount ;
    Login login;
    Regestration regestration;
    NewArrivals newArrivals;
    Wishlist wishlist;

    public WishlistTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        baseMethod();
        regestration=new Regestration();
        myAccount = new MyAccount();
        login= regestration.existing_User();
        myAccount= login.login(props.getProperty("phoneNO"), props.getProperty("password") );
        newArrivals=myAccount.setNewBooks();
        wishlist=newArrivals.clickonBooktogo_Wishlist();
    }

    @Test
    public void wishlist(){
        wishlist.add_a_book_to_WishList();
    }

    @Test
    public void display_Wishlist(){
        wishlist();
        wishlist.display_wishlist();
        myAccount.setMyWishlist();
    }

    @Test
    public void remove_book_Wishlist(){
        display_Wishlist();
        wishlist.remove_a_book_from_wishlist(0);
    }

    @Test
    public void move_book_Cart(){
        display_Wishlist();
        wishlist.move_book_to_cart(0);
    }

    @Test
    public void substracting_quantity_of_book_in_wishlist(){
        display_Wishlist();
        wishlist.minising_book(0);
    }

    @Test
    public void adding_quantity_of_book_in_wishlist(){
        display_Wishlist();
        wishlist.adding_book(0);
    }

    @Test
    public void removing_all_the_books() throws InterruptedException {
        display_Wishlist();
        wishlist.removing_all_books_from_wishlist();
    }

    @Test
    public void moving_all_the_books_to_cart_from_wishlist() throws InterruptedException {
        display_Wishlist();
        wishlist.moving_all_books_to_cart();
    }
//
//    @AfterMethod
//    public void teardown(){
//        driver.quit();
//    }
}
